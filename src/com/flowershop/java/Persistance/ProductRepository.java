package com.flowershop.java.Persistance;

import com.flowershop.java.Domain.FlowerShop;

public class ProductRepository {

    private FlowerShop flowerShop;

    public void FlowerShop(){}

    public void saveFlowerShop(FlowerShop flowerShop) throws Exception{
        if (flowerShop == null) throw new Exception();
        this.flowerShop = flowerShop;
    }

    public FlowerShop getFlowerShop(){
        return flowerShop;
    }

}
