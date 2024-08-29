package Employe;

import java.util.Calendar;

public class FullTiemEmployee extends Employee {
    private double monthlySalary;

    public FullTiemEmployee(String name, int id, Calendar c, double monthlySalary) {
        super(name, id, c);
        super.setSalary(monthlySalary);  // for sorting
        this.monthlySalary = monthlySalary;

    }


    public double getSalary() {
        return monthlySalary;
    }
    public void setSalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }


    @Override
    public String toString() {
        return super.toString()+ " ,monthlySalary= " + this.monthlySalary;
    } 
    
    
}
