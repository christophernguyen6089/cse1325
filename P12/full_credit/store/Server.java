package store;

public class Server extends Person{
    private String ssn;
    
    public Server(String name, String phone, String ssn){
        super(name,phone);
        this.ssn  = ssn;
    }
}
