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
        return products.toString();
    }
}

