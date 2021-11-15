package store;

import store.*;

import java.io.*;

import java.util.ArrayList;
import java.util.Arrays;

import java.awt.*;

public class Store{
    protected String storeName;
    protected ArrayList<Product> products = new ArrayList<Product>();
    protected ArrayList<Person> people    = new ArrayList<Person>();

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
    
    public void addPerson(Person person){
        this.people.add(person);
    }
    public int numberOfPeople(){
        return this.people.size();
    }
    public String personToString(int productIndex){
        return people.get(productIndex).name;
    }
    public String peopleToString(){
        String result = "Our beloved Customers: \n";
        for(int i=0; i<people.size(); i++){
            result += people.toString();
        }
        return result;
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

