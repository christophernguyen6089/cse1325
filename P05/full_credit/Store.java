import java.util.ArrayList;

public class Store{
    public static void cli(){
        ArrayList<Taxfree> taxfree = new ArrayList<>();
        taxfree.add(new Taxfree("Milk",0.99));
        taxfree.add(new Taxfree("Bread",1.99));
        taxfree.add(new Taxfree("Cheese",3.99));
        
        ArrayList<Taxed> taxed = new ArrayList<>();
        taxed.add(new Taxed("Candy Bar",1.99));
        taxed.add(new Taxed("Chips",2.99));
        taxed.add(new Taxed("Soda",3.99));
        
        //while(true){
        taxfree.toString();
        taxed.toString();
        //}
        
    
    }

    public static void main(String args[]){
        cli();
    }
}
