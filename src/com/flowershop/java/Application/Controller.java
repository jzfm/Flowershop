package com.flowershop.java.Application;
import com.flowershop.java.Domain.*;
import com.flowershop.java.Persistance.ProductRepository;
import com.flowershop.java.Utils.Utils;

public class Controller {

    public Controller(){}

     private ProductRepository repository = new ProductRepository();

    public void createFlowerShop(String name) throws Exception {
        FlowerShop flowerShop = new FlowerShop(name);
        repository.saveFlowerShop(flowerShop);
    }

    public TreeDTO addTree(double height, double price) throws Exception {
        Tree tree= new Tree(height, price);
        repository.getFlowerShop().addProduct(tree);
        return new TreeDTO(tree);
    }

    public FlowerDTO addFlower(String color, double price) throws Exception {
        Flower flower= new Flower(color, price);
        repository.getFlowerShop().addProduct(flower);
        return new FlowerDTO(flower);
    }

    public DecorationDTO addDecoration(Utils.Material material, double price) throws Exception {
        Decoration decoration= new Decoration(material, price);
        repository.getFlowerShop().addProduct(decoration);
        return new DecorationDTO(decoration);
    }
}
