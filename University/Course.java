package University;

import java.util.ArrayList;

public class Course {

    private String courseId;
    private String courseTitle;
    private double credit;
    private ArrayList<Student> studntLst= new ArrayList<>();
    private Faculty faculty;

    // Constructor
    public Course() {

    }

    public Course(String courseId, String courseTitle, double credit) {
        this.courseId = courseId;
        this.courseTitle = courseTitle;
        this.credit = credit;
    }

    // To String
    public String toString() {
        return ("Course Title: " +this.courseTitle+  "  Course Id: " + this.courseId + "  Credit: " + this.credit);
    }

    // Getter
    public String getCourseId() {
        return courseId;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public double getCredit() {
        return credit;
    }
    public Student getStudentList(){
        return this.studntLst;
    }
    public Faculty getFaculty(){
        return this.faculty;
    }


    // Setter
    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }
    public void setStudentList(Student a){
        this.studntLst.add(a);
    }
    public void setFaculty(Faculty f){
        this.faculty=f;
    }
    public void deleteStudent(int n){
        this.studntLst.remove(n);
    }


    //Delete Faculty
    public void deleteFaculty(){
        this.faculty=null;
    }
    // Search a student to a course
    public int searchStudentToACourse(int id) {
        int flag = -100;
        int count = 0;
        for (Student x : studntLst) {
            if (id != x.getStudentId()) {
                count++;
            } else {
                return count;
            }
        }
        return flag;
    }

    // print StudentList
    public void printStudentList() {
        System.out.println("\n");
        System.out.println("The students " + this.studntLst.size() + " are in this course: ");
        for (Student x : this.studntLst) {
            System.out.println(x.toString());
        }
    }
}