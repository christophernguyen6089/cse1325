public class Taxfree extends Product{
    public void Taxfree(String name, double cost){
        this.name = name;
        this.unitCost = cost;
    }
    
    @Override
    public Product placeOrder(int quantity){
        this.quantity = quantity;
        return this;
    }
    
    @Override
    public double price(){
        return (this.quantity*this.unitCost);
    }
    
}
