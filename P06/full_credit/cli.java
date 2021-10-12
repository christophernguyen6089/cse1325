import java.util.Scanner;

public class cli{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the name of the store: ");
        String inputName = scan.nextLine();
        Store store = new Store(inputName);
        
        while(true){
            System.out.println("Welcome to "+inputName);
            
            break;
        }
        
    }
}
