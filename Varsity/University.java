package Varsity;
import java.util.Calendar;
import java.util.Collections;
public class University implements Comparable<University>{
    private String name;
    private String address;
    private Calendar dateEstblished;
    private int numberOfDepartments;

    // Constructor
    public University() {
    }
    public University(String name, String address, Calendar dateEstblished, int numberOfDepartments) {
        this.name = name;
        this.address = address;
        this.dateEstblished = dateEstblished;
        this.numberOfDepartments = numberOfDepartments;
    }

    // getter
    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    public Calendar getDateEstblished() {
        return dateEstblished;
    }
    public int getNumberOfDepartments() {
        return numberOfDepartments;
    }

    //Setter
    public void setName(String name) {
        this.name = name;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setDateEstblished(Calendar dateEstblished) {
        this.dateEstblished = dateEstblished;
    }
    public void setNumberOfDepartments(int numberOfDepartments) {
        this.numberOfDepartments = numberOfDepartments;
    }

    // ToString
    @Override
    public String toString() {
        return "University [name=" + name + ", address=" + address + ", dateEstblished=" + dateEstblished.getTime()
                + ", numberOfDepartments=" + numberOfDepartments + "]";
    }
    @Override

    public int compareTo(University o) {

        return -(this.getDateEstblished().get(Calendar.YEAR)-o.getDateEstblished().get(Calendar.YEAR));
    }
    
}