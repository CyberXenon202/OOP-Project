package Varsity;
import java.util.Calendar;

public class PrivateUniversity extends University {
    private boolean ugcApproved;
    private int NumberOfTrusteeMembers;


    public PrivateUniversity() {
    }
    public PrivateUniversity(boolean ugcApproved, int numberOfTrusteeMembers, String name, String address, Calendar dateEstblished, int numberOfDepartments) {
        super(name, address, dateEstblished, numberOfDepartments);
        this.ugcApproved = ugcApproved;
        NumberOfTrusteeMembers = numberOfTrusteeMembers;
    }


    public boolean isUgcApproved() {
        return ugcApproved;
    }
    public int getNumberOfTrusteeMembers() {
        return NumberOfTrusteeMembers;
    }

    
    public void setUgcApproved(boolean ugcApproved) {
        this.ugcApproved = ugcApproved;
    }
    public void setNumberOfTrusteeMembers(int numberOfTrusteeMembers) {
        NumberOfTrusteeMembers = numberOfTrusteeMembers;
    }


    @Override
    public String toString() {
        return "PrivateUniversity \n"+ "ugcApproved= " + ugcApproved + ", NumberOfTrusteeMembers= " + NumberOfTrusteeMembers;
    }


    public void printAllInfo(){
        System.out.println("Private");
        System.out.println("Name: "+this.getName());
        System.out.println("Address: "+this.getAddress());
        System.out.println("Date Of Estblished: "+this.getDateEstblished().get(Calendar.DAY_OF_MONTH)+" "+(this.getDateEstblished().get(Calendar.MONTH)+1)+
        " "+this.getDateEstblished().get(Calendar.YEAR));
        System.out.println("Number Of Dept: "+this.getNumberOfDepartments());
        System.out.println("Ugc approved: "+this.isUgcApproved());
        System.out.println("Number of Trustee Members: "+this.getNumberOfTrusteeMembers());
    }

    
}
