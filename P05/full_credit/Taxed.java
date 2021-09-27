public class Taxed extends Product{
    private double tax;
    
    public Taxed(String name, double cost){
        this.name = name;
        this.unitCost = cost;
    }
    
    setSalesTaxRate(double salesTaxRate){
        this.tax = salesTaxRate;
    }
    
    public Product placeOrder(int quantity){
    }
    
    @Override
    public double price(){
    }
}
