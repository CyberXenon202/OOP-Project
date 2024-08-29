import java.util.Scanner;

public class FractionMain {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

         System.out.print("Enter 1st Numerator & Denominator: ");
         Fraction ob1=new Fraction(input.nextInt(), input.nextInt());

         System.out.print("Enter 2nd Numerator & Denominator: ");
         Fraction ob2= new Fraction(input.nextInt(), input.nextInt());


         ob1.add(ob2);
         ob1.sub(ob2);
         ob1.multiplication(ob2);
         ob1.division(ob2);
    }
    
}
