import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Store{
    public static void cli(){
        Scanner scan = new Scanner(System.in);
        Pattern pattern = Pattern.compile("\\d+");
        int inputID,inputQuantity;
        ArrayList<Taxfree> taxfree = new ArrayList<>();
        taxfree.add(new Taxfree("Milk",0.99));
        taxfree.add(new Taxfree("Bread",1.99));
        taxfree.add(new Taxfree("Cheese",3.99));
        
        ArrayList<Taxed> taxed = new ArrayList<>();
        taxed.add(new Taxed("Candy Bar",1.99));
        taxed.add(new Taxed("Chips",2.99));
        taxed.add(new Taxed("Soda",3.99));
        
        Taxed.setSalesTaxRate(0.10);
        
        //while(true){
            taxfree.toString();
            taxed.toString();
            System.out.print("Please give your order (0=Milk, 1=Bread,..., 5=Soda): ");
            inputID = scan.nextInt();
            Matcher matcherID = pattern.matcher(inputID);
            if(matcherID.matches==false){
                throw new RuntimeException("Invalid input: "+inputQuantity);
            }
            System.out.print("Please give your quantity of said item: ");
            inputQuantity = scan.nextInt();
            Matcher matcherQuantity = pattern.matcher(inputQuantity);
            if(matcherQuantity.matches==false){
                throw new RuntimeException("Invalid input: "+inputQuantity);
            }
            
            /*
            switch (inputID){
                case 0:
                    taxfree("Milk",0.99).placeOrder(inputQuantity);
                    break;
                case 1:
                    taxfree("Milk",1.99).placeOrder(inputQuantity);
                    break;
                case 2:
                    taxfree("Milk",3.99).placeOrder(inputQuantity);
                    break;
                case 3:
                    taxed("Candy Bar",1.99).placeOrder(inputQuantity);
                    break;
                case 4:
                    taxed("Chips",2.99).placeOrder(inputQuantity);
                    break;
                case 5:
                    taxed("Soda",3.99).placeOrder(inputQuantity);
                    break;
                default:
                    break;
                
            }
            */
            
        //}
        
    
    }

    public static void main(String args[]){
        cli();
    }
}
