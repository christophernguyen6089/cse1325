public class Student{
    private String studentName;
    private double examSum=0;
    private double examNumGrades=0;
    
    public void Student(String name){
        this.studentName = name;
    }
    public String getName(){
        return studentName;
    }
    public void addExam(double grade){
        examSum+=grade;
        examNumGrades++;
    }
    public double average(){
        if(examNumGrades==0){
            return 100.000;
        }
        else{
            return examSum/examNumGrades;
        }
    }
}
