import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Grades{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        String inputName;
        String inputMenu;
        Pattern patternName = Pattern.compile("\\w+(\\s\\w+)*");
              
        //Student yourName = new Student();
        
        while(true){
            Student.printMenu();
            inputMenu=scan.nextLine();
            switch(inputMenu){
                case "S":
                    System.out.println("New student's name? ");
                    inputName = scan.nextLine();
                    Matcher matcherName = patternName.matcher(inputName);
                        if(matcherName.matches()==true){
                            //Student(inputName);
                            
                        }
                    else{
                        break;
                    }
                
                case "G":
                    //find how many students are there in the array
                    //enter grades for all of them
                    break;
                
                case "A":
                    //find how many students are there in the array
                    //access both grade arrays and finds the average for all
                    //print
                    break;
                
                case "X":
                    System.exit(1);
                    break;

                default:
                    System.out.println("Please enter a proper input.");
                    break;
            }
        }
        
    }
}
