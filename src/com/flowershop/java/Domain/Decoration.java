package com.flowershop.java.Domain;

import com.flowershop.java.Utils.Utils;

public class Decoration extends Product{

    private Utils.Material material;

    public Decoration(){}

    public Decoration (Utils.Material material, double price) throws Exception {
        super(price);
        if (material == null) throw new Exception();
        this.material = material;
    }

    public void setMaterial(Utils.Material material){
        this.material = material;
    }

    public Utils.Material getMaterial() {
        return this.material;
    }
}
