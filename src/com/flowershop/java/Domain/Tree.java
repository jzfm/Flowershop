package com.flowershop.java.Domain;

public class Tree extends Product {
    private double height;

    public Tree(){}

    public Tree(double height, double price) throws Exception {
        super(price);
        if (height <= 0) throw new Exception();
        this.height = height;
    }

    public void setHeight(double height){
        this.height = height;
    }

    public double getHeight() {
        return height;
    }
}
