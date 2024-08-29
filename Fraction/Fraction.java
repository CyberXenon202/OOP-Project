public class Fraction {
    private int numerator;
    private int denominator;

    //Constructor
    public Fraction(){

    }
    public Fraction(int numerator, int denominator){
        this.numerator=numerator;
        this.denominator=denominator;
    }


    //Get method
    public int getNumerator(){
        return this.numerator;
    }
    public int getDenominator(){
        return this.denominator;
    }


    //Set method
    public void setNumerator(int a){
        this.numerator=a;
    }
    public void setDenominator(int b){
        this.denominator=b;
    }


    // To String
    public String toString(Fraction f){
        return (f.getNumerator()+ "/"+f.getDenominator());
    }
    

    //Adding method
    public void add(Fraction f){
       int r1=this.getNumerator()*f.getDenominator() + f.getNumerator()*this.getDenominator();
       int r2=this.getDenominator() * f.getDenominator();

       System.out.println("Adding: "+toString(this)+" + "+toString(f)+ " = "+r1 + "/" +r2);
    }


    //Subtraction method
    public void sub(Fraction f){
       int r1=this.getNumerator()*f.getDenominator() - f.getNumerator()*this.getDenominator();
       int r2=this.getDenominator() * f.getDenominator();

       System.out.println("Subtraction: "+toString(this)+" - "+toString(f)+ " = "+r1 + "/" +r2);

    }


    //Multiplication method
    public void multiplication(Fraction f){
       int r1=this.getNumerator()*f.getNumerator();
       int r2=this.getDenominator() * f.getDenominator();

       System.out.println("Multiplication: "+toString(this)+" * "+toString(f)+ " = "+r1 + "/" +r2);

    }


    //Division method
    public void division(Fraction f){
       int r1=(this.getNumerator()*f.getDenominator());
       int r2=this.getDenominator() * f.getNumerator();

       System.out.println("Division: "+toString(this)+" / "+toString(f)+ " = "+r1 + "/" +r2);

    }
    
}
