package University;

import java.util.ArrayList;

public class Student {
    private int studentId;
    private String studentName;
    private double studentCGPA;
    private static int numberOfStudent=0;
    


    //Constructor
    public Student(){

    }
    public Student(int studentId, String studentName, double studentCGPA){
        this.studentId=studentId;
        this.studentName=studentName;
        this.studentCGPA=studentCGPA;
        this.numberOfStudent++;
    }

    //To String
    public String toString(){
        return ("Name : "+ this.studentName+"  Id: "+this.studentId+"  CGPA: "+this.studentCGPA);
    }

    //Getter 
    public int getStudentId() {
        return studentId;
    }
    public String getStudentName() {
        return studentName;
    }
    public double getStudentCGPA() {
        return studentCGPA;
    }
    public int getNumberOfStudent(){
        return numberOfStudent;
    }

    //Setter
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    public void setStudentCGPA(double studentCGPA) {
        this.studentCGPA = studentCGPA;
    }
    public static void increaseNumberofStudent(){
        numberOfStudent++;
    }
    public static void decreaseNumberofStudent(){
        numberOfStudent--;
    }
}
