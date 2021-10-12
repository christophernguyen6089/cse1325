import java.util.ArrayList;

public class Store{
    protected String storeName;
    protected ArrayList<Product> products = new ArrayList<Product>();
    
    //products.addProduct("Choco Dough",2.99,0.99,chocolate,true,unfilled);

    public Store(String storeName){
        this.storeName=storeName;
    }
    public String storeName(){
        return this.storeName;
    }
    public void addProduct(Product product){
        this.products.add(product);
    }
    public int numberOfProducts(){
        return this.products.size();
    }
    public String toString(int productIndex){
        return products.get(productIndex).name;
    }
    @Override
    public String toString(){
        return products.toString();
    }
}

