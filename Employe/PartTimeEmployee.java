package Employe;

import java.util.Calendar;

public class PartTimeEmployee extends Employee {
    private int hour;
    private double hourlyRate;
   
    public PartTimeEmployee(String name, int id, Calendar c, int hour, double hourlyRate) {
        super(name, id, c);
        super.setSalary(this.getSalary());  // For sorting
        this.hour = hour;
        this.hourlyRate = hourlyRate;
    }

    public int getHour() {
        return hour;
    }
    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }
    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double getSalary() {
        if(this.getHourlyRate()<=200){
            return (this.getHour()*200);
        }
        else{
            return (this.getHour()*this.getHourlyRate());
        }
    }

    @Override
    public String toString() {
        return super.toString()+" ,hour= " + hour + ", hourlyRate= " + hourlyRate +" Salary= "+this.getSalary();
    }

    

}
