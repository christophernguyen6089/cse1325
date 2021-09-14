import java.util.ArrayList;

public class Student{
    private String studentName;
    private ArrayList studentNameList = new ArrayList();
    private double examSum = 0;
    private ArrayList examSumList = new ArrayList();
    private double examNumGrades = 0;
    private ArrayList examNumGradesList = new ArrayList();
    
    public void printMenu(){
        System.out.println("Main menu\n==========");
        System.out.println("\nAdd new (S)tudents\nAdd exam (G)rades\nList all (A)verages\nE(X)it\n");
        System.out.print("Command? ");
    }
    
    public void Student(String name){
        this.studentName = name;
        studentNameList.add(name);
    }
    public String getName(){
        return studentName;
    }
    public void addExam(double grade, int j){
        examSumList[j]+=grade;
        examSumList[j]=examSum;
        examNumGradesList[j]+=1;
    }
    public double average(int k){
        if(examNumGrades==0){
            return 100.000;
        }
        else{
            return examSumList[k]/examNumGradesList[k];
        }
    }
}
