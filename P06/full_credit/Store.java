import java.util.ArrayList;

public class Store{
    protected String storeName;
    protected ArrayList<Product> products = new ArrayList<Product>();
    
    public void Store(String storeName){
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
        //TODO
        return "a";
    }
}

