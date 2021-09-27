abstract class Product{
    protected String name;
    protected double unitCost;
    protected int quantity;
    
    public void Product(String name, double unitCost){
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
        System.out.println(this.name +" ($" +(int)this.unitCost+".%.2f"+this.unitCost);
        return str1;
    }
    
}