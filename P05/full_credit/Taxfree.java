public class Taxfree extends Product{
    public Taxfree(String name, double cost){
        this.name = name;
        this.unitCost = cost;
    }
    
    public Product placeOrder(int quantity){
    }
    
    @Override
    public double price(){
    }
    
}
