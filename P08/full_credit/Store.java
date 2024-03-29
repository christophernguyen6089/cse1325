package store;

import java.util.ArrayList;
import java.util.Arrays;

public class Store{
    protected String storeName;
    protected ArrayList<Product> products = new ArrayList<Product>();
    
    //products.add(new Donut("Coco Late",2.99,0.99,chocolate,true,unfilled));
    //addProduct(new Donut("Coco Late",2.99,0.99,chocolate,true,unfilled));
    
    //Product ChocoDoe = new Product("Chocolate",2.99,0.99, chocolate, true, unfilled);
    //Donut ChocoDoe = new Donut("Chocolate",2.99,0.99, chocolate, true, unfilled);
    
    //addProduct(ChocoDoe);

    public Store(String storeName){
        this.storeName=storeName;
    }
    public String storeName(){
        return this.storeName;
    }
    public void addProduct(Product product){
        this.products.add(product);
    }
    public int numberOfProducts(){
        return this.products.size();
    }
    public String toString(int productIndex){
        return products.get(productIndex).name;
    }
    @Override
    public String toString(){
    //Code courtesy of George F. Rice, respective licenses apply
        String result = "\nWelcome to "+ storeName + "\n\n";
        for(int i=0; i<products.size(); i++){
            result += i+ ") "+products.get(i) + "\n";
        }
        return result;
    }
}

