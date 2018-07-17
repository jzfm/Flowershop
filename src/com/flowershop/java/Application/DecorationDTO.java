package com.flowershop.java.Application;

import com.flowershop.java.Domain.Decoration;
import com.flowershop.java.Utils.Utils;

public class DecorationDTO extends ProductDTO{

    protected Utils.Material material;

    public DecorationDTO(Decoration decoration) throws Exception {
        super(decoration);
        this.material = decoration.getMaterial();
    }

    public Utils.Material getMaterial(){
        return this.material;
    }
}