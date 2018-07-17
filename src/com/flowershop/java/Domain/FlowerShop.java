package com.flowershop.java.Domain;

import java.util.ArrayList;
import java.util.List;

public class FlowerShop {
    private String name;
    private List<Product> stock = new ArrayList<>();

    public FlowerShop(String name){
        this.name=name;
    }

    public void addProduct (Product product) throws Exception {
        if (product == null) throw new Exception();
        stock.add(product);
    }
/*
    public void removeProduct (Product product){

        for (Product product1 : stock) {
            if (product1 == product){
                stock.remove(product1);
                return;
            }
        }
    }
*/
    public String getName(){
        return this.name;
    }
  /*
    public void sellProduct(Product product){
        removeProduct(product);
    }
*/
    public List<Product> getStock(){
        return stock;
    }
}
