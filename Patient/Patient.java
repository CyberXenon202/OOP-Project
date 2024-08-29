package Patient;

public class Patient implements Comparable<Patient> {
    private String name;
    private int age;
    private double systolic;
    private double diastolic;
    private double diabetesPoint;

    // Constructor
    public Patient() {
    }
    public Patient(String name, int age, double systolic, double diastolic, double diabetesPoint) {
        this.name = name;
        this.age = age;
        this.systolic = systolic;
        this.diastolic = diastolic;
        this.diabetesPoint = diabetesPoint;
    }

    // getter
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public double getSystolic() {
        return systolic;
    }
    public double getDiastolic() {
        return diastolic;
    }
    public double getDiabetesPoint() {
        return diabetesPoint;
    }

    // Setter
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setSystolic(double systolic) {
        this.systolic = systolic;
    }
    public void setDiastolic(double diastolic) {
        this.diastolic = diastolic;
    }
    public void setDiabetesPoint(double diabetesPoint) {
        this.diabetesPoint = diabetesPoint;
    }

    // To String
    @Override
    public String toString() {
        return "Patient\n"+"name= " + name + ", age= " + age + ", systolic= " + systolic + ", diastolic= " + diastolic
                + ", diabetesPoint= " + diabetesPoint;
    }
    @Override
    public int compareTo(Patient o) {
        return -(this.getAge()- o.getAge());
    }
    
    
    

    
}
