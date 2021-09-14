import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test{
    public static void main(String args[]){
        String yourName;
        String yourGrade;
        
        Scanner scan = new Scanner(System.in);
        Pattern patternName = Pattern.compile("\\w+(\\s\\w+)*");
        Pattern patternGrade= Pattern.compile("\\d+"); 
        System.out.println("Enter your name: ");
        yourName = scan.nextLine();
        Matcher matcherName = patternName.matcher(yourName);
        if(matcherName.matches()==true){
            System.out.print("Great. "+yourName+", please enter an integer grade: ");
            while(true){
                yourGrade = scan.nextLine();
                Matcher matcherGrade = patternGrade.matcher(yourGrade);
                if(matcherGrade.matches()==true){
                    System.out.print("Grade entered: "+yourGrade+"\nNow please enter another: ");
                }
                else{
                    System.err.println("ERROR: Not a valid grade!");
                    System.exit(-2);
                }
                
            }           
        }
        else{
            System.err.println("ERROR: Not a valid name!");
            System.exit(-1);
        }
    }
}
