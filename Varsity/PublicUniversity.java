package Varsity;
import java.util.Calendar;

public class PublicUniversity extends University {
    private int NumberOfHalls;
    private boolean PoliticsAllowed;

    // Constructor
    public PublicUniversity() {
    }
    public PublicUniversity(int numberOfHalls, boolean politicsAllowed, String name, String address, Calendar dateEstblished, int numberOfDepartments) {
        super(name, address, dateEstblished, numberOfDepartments);
        NumberOfHalls = numberOfHalls;
        PoliticsAllowed = politicsAllowed;
    }


    public int getNumberOfHalls() {
        return NumberOfHalls;
    }
    public boolean isPoliticsAllowed() {
        return PoliticsAllowed;
    }


    public void setNumberOfHalls(int numberOfHalls) {
        NumberOfHalls = numberOfHalls;
    }
    public void setPoliticsAllowed(boolean politicsAllowed) {
        PoliticsAllowed = politicsAllowed;
    }


    @Override
    public String toString() {
        return "PublicUniversity \n"+"NumberOfHalls= " + NumberOfHalls + ", PoliticsAllowed= " + PoliticsAllowed;
    }

    public void printAllInfo(){
        System.out.println("Public");
        System.out.println("Name: "+this.getName());
        System.out.println("Address: "+this.getAddress());
        System.out.println("Date Of Estblished: "+this.getDateEstblished().get(Calendar.DAY_OF_MONTH)+" "+(this.getDateEstblished().get(Calendar.MONTH)+1)+
        " "+this.getDateEstblished().get(Calendar.YEAR));
        System.out.println("Number Of Dept: "+this.getNumberOfDepartments());
        System.out.println("Number of Halls: "+this.getNumberOfHalls());
        System.out.println("Politics Allowed: "+this.isPoliticsAllowed());
    }

    
    
}
