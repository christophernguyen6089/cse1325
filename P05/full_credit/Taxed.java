public class Taxed extends Product{
    private static double tax;
    
    public void Taxed(String name, double cost){
        this.name = name;
        this.unitCost = cost;
    }
    
    static void setSalesTaxRate(double salesTaxRate){
        tax = salesTaxRate;
    }
    
    @Override
    public Product placeOrder(int quantity){
        this.quantity += quantity;
        return this;
    }
    
    @Override
    public double price(){
        return ((1+this.tax)*this.quantity*this.unitCost);
    }
}
