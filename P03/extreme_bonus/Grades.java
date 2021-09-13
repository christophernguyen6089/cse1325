import java.util.Scanner;
//TODO: import regex

public class Grades{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        String inputName;
        String inputMenu;
        
        ArrayList inputList = new ArrayList();
        
        Student yourName = new Student();
        
        while(true){
            printMenu();
            inputMenu=scan.nextLine();
            switch(inputMenu){
                case "S":
                    System.out.println("New student's name? ");
                    inputName = scan.nextLine();
                    inputList.add(inputName);
                    
                    break;
                case "s":
                    System.out.println("New student's name? ");
                    inputName = scan.nextLine();
                    
                    break;
                
                case "G":
                case "g":
                
                case "A":
                case "a":
                
                case "X":
                    System.exit();
                    break;
                case "x":
                    System.exit();
                    break;
                default:
                    System.out.println("Please enter a proper input.");
                    break;
            }
        }
        
    }
}
