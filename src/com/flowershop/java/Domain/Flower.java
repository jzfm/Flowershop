package com.flowershop.java.Domain;

public class Flower extends Product{

    private String color;

    public Flower(){
    }

    public Flower(String color, double price) throws Exception {
        super(price);
        if (color.equals("")) throw new Exception();
        this.color = color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }
}
