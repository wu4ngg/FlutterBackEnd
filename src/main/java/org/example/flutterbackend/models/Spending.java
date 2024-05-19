package org.example.flutterbackend.models;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Spending {
    @Id @GeneratedValue
    private int id;
    private String title;
    private Date date;
    private double price;
    @ManyToOne
    @JoinColumn(name = "purpose")
    private Purpose purpose;

    public Spending(int id, String title, Date date, double price) {
        this.id = id;
        this.title = title;
        this.date = date;
        this.price = price;
    }

    public Spending() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Purpose getSpending() {
        return purpose;
    }

    public void setSpending(Purpose purpose) {
        this.purpose = purpose;
    }
}
