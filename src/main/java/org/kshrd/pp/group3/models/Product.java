package org.kshrd.pp.group3.models;

import java.time.LocalDate;

public class Product {
    private static int idCounter = 1;
    private int id;
    private String name;
    private double price;
    private int qty;
    private double pay;
    private LocalDate importedDate;

    public Product(String name, double price, int qty, double pay, LocalDate importedDate) {
        this.id = idCounter++;
        this.name = name;
        this.price = price;
        this.qty = qty;
        this.pay = pay;
        this.importedDate = importedDate;
    }

    public static int getIdCounter() {
        return idCounter;
    }

    public static void setIdCounter(int idCounter) {
        Product.idCounter = idCounter;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    public LocalDate getImportedDate() {
        return importedDate;
    }

    public void setImportedDate(LocalDate importedDate) {
        this.importedDate = importedDate;
    }
    public double getTotalPrice(){
        return price * qty;
    }
}
