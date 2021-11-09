package store;

import java.io.*;

public class Product{
    protected String name;
    protected double price;
    protected double cost;

    public Product(String name, double price, double cost){
        this.name=name;
        this.price=price;
        this.cost=cost;
    }
    public String name(){
        return this.name;
    }
    
    public Product(BufferedReader br) throws IOException{
        this.name = br.readLine();
        this.cost = Double.parseDouble(br.readLine());
        this.price = Double.parseDouble(br.readLine());
    }
    
    public void save(BufferedWriter br) throws IOException{
        br.write(""+name+'\n');
        br.write(""+cost+'\n');
        br.write(""+price+'\n');
    }
    
    @Override
    public String toString(){
    //Code courtesy of George F. Rice, respective licenses apply
        return "Name: "+this.name+"\nPrice: $"+this.price;
    }
}

