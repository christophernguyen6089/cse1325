import java.util.ArrayList;

abstract class Product{
    protected String name;
    protected double unitCost;
    protected int quantity;
    
    public Product(String name, double unitCost){
        this.name = name;
        this.unitCost = unitCost;
        if(unitCost<0){
            //Throw Exception
        }
        this.quantity = 0;
    }
    
    public abstract Product placeOrder(int quantity);
    
    public abstract double price();
    
    @Override
    public String toString(){
        String str1 = "";
        //int index=0;
        
        /*
        System.out.println("0) Milk ($0.99)");
        System.out.println("1) Bread ($1.99)");
        System.out.println("2) Cheese ($3.99)");
        System.out.println("3) Candy bar ($1.99)");
        System.out.println("4) Chips ($2.99)");
        System.out.println("5) Soda ($0.99)");
        */
        
        System.out.println(this.name +" ($"+this.unitCost+")");
        //index++;
        
        return str1;
    }
    
}
