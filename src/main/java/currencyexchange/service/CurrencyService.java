package currencyexchange.service;

import currencyexchange.entity.Currency;
import currencyexchange.exceptions.CurrencyNotFoundException;
import currencyexchange.repositories.CurrencyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@RequiredArgsConstructor

@Component
public class CurrencyService {

    private final CurrencyRepository currencyRepository;

    public void addCurrency(Currency currency) {
        currencyRepository.save(currency);
    }

    public List<Currency> getALl() {
        return currencyRepository.findAll();
    }

    public Currency getById(Long id) {
        return currencyRepository.findById(id).orElseThrow(() -> new CurrencyNotFoundException(id));
    }

    public void deleteById(Long id) {
        currencyRepository.deleteById(id);
    }

    public void update(Long id) {

    }
}
