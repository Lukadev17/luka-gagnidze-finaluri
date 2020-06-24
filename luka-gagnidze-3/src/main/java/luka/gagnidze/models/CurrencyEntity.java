package luka.gagnidze.models;

import java.util.Date;

public class CurrencyEntity {
    private String title;
    private String description;
    private double rate;
    private Date date;

    public CurrencyEntity() {
    }

    public CurrencyEntity(String title, String description, double rate, Date date) {
        this.title = title;
        this.description = description;
        this.rate = rate;
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
