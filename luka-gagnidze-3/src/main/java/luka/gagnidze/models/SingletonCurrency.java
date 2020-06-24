package luka.gagnidze.models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SingletonCurrency {
    private static List<CurrencyEntity> currencyData;
    private static Date datetime;

    private SingletonCurrency() {
    }

    public static List<CurrencyEntity> getInstance(){
        if (currencyData == null || datetime == null) {
            currencyData = new ArrayList<CurrencyEntity>();
            currencyData.add(new CurrencyEntity("USD", "1 ამერიკული დოლარი", 3.2 , new Date()));
            currencyData.add(new CurrencyEntity("BRL", "1 ბრაზილიური რიალი ", 3.425 , new Date()));
            currencyData.add(new CurrencyEntity("CAD", "1 კანადური დოლარი", 2.2568 , new Date()));
            currencyData.add(new CurrencyEntity("JPY", "100 იაპონური იენი", 2.8516 , new Date()));
            datetime = new Date();


        }
        return currencyData;
    }

    public static String getDate(){
        if (datetime == null) {
            datetime = new Date();
        }
        return String.valueOf(datetime);
    }
}
