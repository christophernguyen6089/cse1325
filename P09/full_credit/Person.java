package store;

import java.util.ArrayList;

public class Person{
    protected String name;
    protected String phone;
    
    public Person(String name, String phone){
        this.name = name;
        this.phone= phone;
    }
    
    /*
    public Person(BufferedReader br){
        
    }
    
    
    @Override
    public void save(BufferedWriter bw){
        
    }
    */
    
    @Override
    public String toString(){
        String result = this.name + " " + this.phone+'\n';
        return result;
    }
}

