package com.flowershop.java.Application;

import com.flowershop.java.Domain.Product;


public abstract class ProductDTO {

    private double price;

    public ProductDTO(Product product) throws Exception {
        if(product == null) throw new Exception();
        this.price = product.getPrice();
    }

    public double getPrice() {
        return price;
    }

}

