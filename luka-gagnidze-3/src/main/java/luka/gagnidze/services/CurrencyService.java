package luka.gagnidze.services;

import luka.gagnidze.models.Currency;
import luka.gagnidze.models.CurrencyEntity;
import luka.gagnidze.models.SingletonCurrency;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

@WebService
public class CurrencyService {

    @WebMethod
    public String getCurrency(Currency currency){
        List<CurrencyEntity> currencyArray= SingletonCurrency.getInstance();
        double rate = 0.0;
        for (CurrencyEntity currencyEntity : currencyArray) {
            if (currencyEntity.getTitle().equals(currency.getCurrency())) {
                rate = currencyEntity.getRate();

            }
        }
        return String.valueOf(rate);
    }

    @WebMethod
    public String getCurrencyDescription(Currency currency){
        List<CurrencyEntity> currencyArray= SingletonCurrency.getInstance();
        String description = null;
        for (CurrencyEntity currencyEntity : currencyArray) {
            if (currencyEntity.getTitle().equals(currency.getCurrency())) {
                description = currencyEntity.getDescription();
            }
        }
        return description;
    }

    @WebMethod
    public String getDate() {
        return SingletonCurrency.getDate();
    }

}
