package currencyexchange.exceptions;

public class CurrencyNotFoundException extends RuntimeException {

    public CurrencyNotFoundException(Long id) {
        super(" " + id);
    }
}
