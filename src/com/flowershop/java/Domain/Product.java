package com.flowershop.java.Domain;

public abstract class Product {
    private double price;

    protected Product(){}

    protected Product(double price)throws Exception{
        if(price < 0) throw new Exception();
        this.price = price;
    }

    protected void setPrice(double price){
        this.price = price;
    }

    public double getPrice(){
        return this.price;
    }
}
