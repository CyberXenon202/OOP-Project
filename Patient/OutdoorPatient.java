package Patient;

public class OutdoorPatient extends Patient {
    private String specialty;
    private double consultationFee;
   
    public OutdoorPatient(String name, int age, double systolic, double diastolic, double diabetesPoint,String specialty, double consultationFee) {
       
        super(name, age, systolic, diastolic, diabetesPoint);
        this.specialty = specialty;
        this.consultationFee = consultationFee;
    }

    // getter
    public String getSpecialty() {
        return specialty;
    }
    public double getConsultationFee() {
        return consultationFee;
    }

    // Setter
    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }
    public void setConsultationFee(double consultationFee) {
        this.consultationFee = consultationFee;
    }

    @Override
    public String toString() {
        return super.toString()+" \nOutdoorPatient"+" specialty= " + specialty + ", consultationFee= " + consultationFee + "]";
    }

    public double getInvoice(){
        return this.consultationFee;
    }
    
}
