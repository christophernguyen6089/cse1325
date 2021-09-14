import java.util.Scanner;

public class Grades{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        double inputGrade = 0;
        String inputName;
        System.out.print("Please enter your name: ");
        
        inputName = scan.nextLine();
        Student yourName = new Student();
        yourName.Student(inputName);
        
        while(true){
            System.out.print("Enter your exam grade (< 0 when done): ");
            inputGrade = scan.nextDouble();
            if(inputGrade<0){
                System.out.println("Done. "+yourName.getName()+", your average is: "+yourName.average());
                break;
            }
            else{
                yourName.addExam(inputGrade);
            }
            
        }
    }
}
