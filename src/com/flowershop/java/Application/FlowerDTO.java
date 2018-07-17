package com.flowershop.java.Application;

import com.flowershop.java.Domain.Flower;

public class FlowerDTO extends ProductDTO{

    protected String color;

    public FlowerDTO(Flower flower) throws Exception {
        super(flower);
        this.color = flower.getColor();
    }

    public String getColor(){
        return this.color;
    }
}