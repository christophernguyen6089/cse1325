import java.util.ArrayList;

public class Donut extends Product{
    protected Frosting frosting;
    protected boolean sprinkles;
    protected Filling filling;

    public Donut(String name, double price, double cost, Frosting frosting, boolean sprinkles, Filling filling){
        super(name,price,cost);
        this.frosting = frosting;
        this.sprinkles = sprinkles;
        this.filling = filling;
    }
    @Override
    public String toString(){
        return super.toString();
    }
    
    //Donut ChocoDoe = new Donut("Chocolate",2.99,0.99, chocolate, true, unfilled);
}

