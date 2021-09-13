import java.util.Scanner;

public class Grades{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int flag = 1;
        double inputGrade = 0;
        String inputName;
        System.out.print("Please enter your name: ");
        
        inputName = scan.nextLine();
        Student yourName = new Student();
        yourName.Student(inputName);
        
        while(flag==1){
            System.out.print("Enter your exam grade, enter '-1' to exit: ");
            inputGrade = scan.nextInt();
            if(inputGrade==-1.0){
                System.out.println("Done. "+yourName.getName()+", your average is: "+yourName.average());
                break;
            }
            else{
                yourName.addExam(inputGrade);
            }
            
        }
    }
}
