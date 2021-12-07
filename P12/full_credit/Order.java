package store;

import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class Order{
    private int id;
    static int nextID=0;
    private Customer customer;
    private Server server;
    
    private HashMap<Product, Integer> products = new HashMap<>();
    
    public Order(Customer customer, Server server){
        this.customer = customer;
        this.server = server;
        this.id = nextID++;
        products = new HashMap<>();
    }
    
    public int getID(){
        return this.id;
    }
   
    public void addProduct(int quantity, Product product){
        if(products.containsKey(product)) quantity += products.get(product);
        products.put(product, quantity);
    }
    
    @Override
    public String toString(){
        String result = "Order "+id+ " for " +customer+ "\n  Server: "+server+"\n";
        return result;
    }
}

