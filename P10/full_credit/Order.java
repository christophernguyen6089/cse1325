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
    }
    
    public int getID(){
        return this.id;
    }
   
    public void addProduct(int quantity, Product product){
        
    }
    
    @Override
    public String toString(){
        String result = "";
        return result;
    }
}

