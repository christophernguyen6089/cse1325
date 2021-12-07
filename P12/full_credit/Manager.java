package store;

public class Manager extends Person{
    private String ssn;
    
    public Manager(String name, String phone, String ssn){
        super(name,phone);
        this.ssn  = ssn;
    }
}
