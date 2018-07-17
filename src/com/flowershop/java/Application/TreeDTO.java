package com.flowershop.java.Application;

import com.flowershop.java.Domain.Tree;

public class TreeDTO extends ProductDTO{

    protected double height;

    public TreeDTO(Tree tree) throws Exception {
        super(tree);
        this.height = tree.getHeight();
    }

    public double getHeight(){
        return this.height;
    }
}
