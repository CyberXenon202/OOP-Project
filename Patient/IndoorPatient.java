package Patient;

import java.util.Calendar;

public class IndoorPatient extends Patient {
    private Calendar admissionDate;
    private int bedNo;
    private double dailyFee;



    public IndoorPatient(){
    
    }
    public IndoorPatient(String name, int age, double systolic, double diastolic, double diabetesPoint,Calendar admissionDate, int bedNo, double dailyFee) {
        super(name, age, systolic, diastolic, diabetesPoint);
        this.admissionDate = admissionDate;
        this.bedNo = bedNo;
        this.dailyFee = dailyFee;
    }


    public Calendar getAdmissionDate() {
        return admissionDate;
    }
    public int getBedNo() {
        return bedNo;
    }
    public double getDailyFee() {
        return dailyFee;
    }


    public void setAdmissionDate(Calendar admissionDate) {
        this.admissionDate = admissionDate;
    }
    public void setBedNo(int bedNo) {
        this.bedNo = bedNo;
    }
    public void setDailyFee(double dailyFee) {
        this.dailyFee = dailyFee;
    }


    @Override
    public String toString() {
        return super.toString()+" \nIndoorPatient  "+" admissionDate= " + this.getAdmissionDate().get(Calendar.DAY_OF_MONTH)+" "+(this.getAdmissionDate().get(Calendar.MONTH)+1) +" "+this.getAdmissionDate().get(Calendar.YEAR) +", bedNo= " + bedNo + ", dailyFee= " + dailyFee;
    }
    

    public double getInvoice(){
        
        Calendar current = Calendar.getInstance();

        int year = current.get(Calendar.YEAR) - this.getAdmissionDate().get(Calendar.YEAR);
        int month = current.get(Calendar.MONTH) - this.getAdmissionDate().get(Calendar.MONTH);
        int day =current.get(Calendar.DAY_OF_MONTH) - this.getAdmissionDate().get(Calendar.DAY_OF_MONTH);
        int total= ( year*365) + (month * 30) +day;

        return total* this.getDailyFee(); 
    }
    
    
    
    

}
