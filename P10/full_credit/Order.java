package store;

import java.util.ArrayList;

public class Order{
    private int id;
    private Customer customer;
    private Server server;
    
    public Order(Customer customer, Server server){
        this.customer = customer;
        this.server = server;
    }
    
    public int getID(){
        
    }
   
    public void addProduct(int quantity, Product product){
    
    }
    
    @Override
    public String toString(){
        String result = "";
        return result;
    }
}

