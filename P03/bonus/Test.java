import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test{
    public static int main(String args[]){
        String yourName;
        double yourGrade;
        
        Scanner scan = new Scanner(System.in);
        Pattern patternName = Pattern.compile("^-?\\w+(\\s\\w+)*");
        Pattern patternGrade= Pattern.compile("^-?\\d+.\\d+"); 
        System.out.println("Enter your name: ");
        yourName = scan.nextLine();
        Matcher matcherName = patternName.matcherName(yourName);
        //why does this make error?
        if(matcherName.find()){
            System.out.print("Great. "+yourName+", please enter a grade: ");
            while(true){
                yourGrade = scan.nextDouble();
                Matcher matcherGrade = patternGrade.matcherGrade(yourGrade);
                //why does this make error?
                if(matcherGrade.find()){
                    System.out.println("Grade entered: "+yourGrade);
                }
                else{
                    //TODO: tell the user its an invalid double input
                    System.exit(-2);
                }
                
            }           
        }
        else{
            //TODO: tell the user its an invalid string input
            System.exit(-1);
        }
    }
}
