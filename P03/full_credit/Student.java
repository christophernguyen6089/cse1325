public class Student{
    private string studentName;
    private double examSum=0;
    private double examNumGrades=0;
    
    public void Student(String name){
        this.name = studentName;
    }
    public string getName(){
        return studentName;
    }
    public void addExam(double grade){
        examSum+=grade;
        examNumGrades++;
    }
    public double average(){
        if(examNumGrades.equals(0)){
            return 100.00;
        }
        else{
            return examSum/examNumGrades;
        }
    }
}
