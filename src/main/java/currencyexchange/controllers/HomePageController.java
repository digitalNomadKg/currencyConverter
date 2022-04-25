package currencyexchange.controllers;

import currencyexchange.entity.Currency;
import currencyexchange.responseHandler.ResponseHandler;
import currencyexchange.service.CurrencyService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor

@RestController
@RequestMapping("/currency")
public class HomePageController {

    private final CurrencyService currencyService;

    @PostMapping()
    public ResponseEntity<Object> add(@RequestBody Currency add) {
        try {
            currencyService.addCurrency(add);
            return ResponseHandler.generateResponse("Added successfully".toUpperCase(), HttpStatus.CREATED, add);
        } catch (Exception exception) {
            return ResponseHandler.generateResponse("Bad request, please check!", HttpStatus.BAD_REQUEST, null);
        }
    }

    @GetMapping
    public ResponseEntity<Object> get() {
        try {
            List<Currency> currencyList = currencyService.getALl();
            if (currencyList.isEmpty()) {
                return ResponseHandler.generateResponse("No content found".toUpperCase(), HttpStatus.NO_CONTENT, currencyList);
            }
            return ResponseHandler.generateResponse("Success".toUpperCase(), HttpStatus.OK, currencyList);

        } catch (Exception exception) {
            return ResponseHandler.generateResponse("No content found", HttpStatus.NOT_FOUND, null);
        }
    }

    @GetMapping("{id}")
    public ResponseEntity<Object> getById(@PathVariable("id") Long id) {
        try {
            Currency currency = currencyService.getById(id);
            return ResponseHandler.generateResponse("Successfully retrieved".toUpperCase(), HttpStatus.OK, currency);

        } catch (Exception exception) {
            return ResponseHandler.generateResponse("Currency under ID: " + id + ", not found".toUpperCase(), HttpStatus.NOT_FOUND, null);
        }
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Object> delete(@PathVariable Long id) {
        try {
            currencyService.deleteById(id);
            return ResponseHandler.generateResponse("Deleted".toUpperCase(), HttpStatus.OK, "User under ID: " + id + " successfully deleted");

        } catch (Exception exception) {
            return ResponseHandler.generateResponse("Currency under ID: " + id + " ,not found", HttpStatus.NOT_FOUND, null);
        }
    }


//    //PUT for an entity. If the entity is not found will create a new one
//    @RequestMapping(value = "/edit", method = RequestMethod.PUT)
//    public @ResponseBody
//    Currency replaceEmployee(@RequestBody Currency newCurrency) {
//
//        return currencyRepository.findById(newCurrency.getId())
//                .map(currency -> {
//                    currency.setFullCurrencyName(newCurrency.getFullCurrencyName());
//                    currency.setConversionFactor(newCurrency.getConversionFactor());
//                    currency.setShortCurrencyName(newCurrency.getShortCurrencyName());
//                    return currencyRepository.save(currency);
//                })
//                .orElseGet(() -> {
//                    return currencyRepository.save(newCurrency);
//                });
//    }

}
