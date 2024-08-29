package Patient;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

import Employe.FullTiemEmployee;
import Employe.PartTimeEmployee;

public class Main {
    
    public static ArrayList<Patient> patients= new ArrayList<>();

    public static void printLowAndHighBloodPressurePatient(){
        for(Patient x: patients){

            if(x instanceof OutdoorPatient){
                OutdoorPatient out= (OutdoorPatient)x;
                if(out.getSystolic()>120 || out.getDiastolic()<80){
                    System.out.println(out.toString());
                }
            }
            else{
                IndoorPatient in= (IndoorPatient)x;
                if(in.getSystolic()>120 || in.getDiastolic()<80){
                    System.out.println(in.toString());
                }
            }
        }
    }

    public static void printAllInfo(){
        for(Patient x: patients){
            if(x instanceof OutdoorPatient){
                OutdoorPatient out = (OutdoorPatient) x ;
                System.out.println("Outdoor");
                System.out.println(out.toString());
                System.out.println("Bill: "+out.getInvoice()); 
            }

            if(x instanceof IndoorPatient){
                IndoorPatient in = (IndoorPatient) x;
                System.out.println("Indoor");
                System.out.println(in.toString());
                System.out.println("Bill: "+in.getInvoice());
            }
        }
    }

    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

         while (true) {
            System.out.println("\n1. Add Outdoor patient\n2. Add Indoor patient\n"+
            "3. Sort By age\n4. Print Low & High blood pressure patient\n5. Pritn all Info\n6. Exist");
            int x= input.nextInt();
            input.nextLine();
            if(x==6){
                break;
            }
            else{
                switch (x) {
                    case 1:
                        for(int i = 0 ;i<3 ;i++){

                            System.out.print("Enter patient name: ");
                            String name = input.nextLine();

                            System.out.print("Enter patient age: ");
                            int age = input.nextInt();

                            System.out.print("Enter systolic: ");
                            double systolic = input.nextDouble();

                            System.out.print("Enter diastolic: ");
                            double diastolic = input.nextDouble();

                            System.out.print("Enter diabetes point: ");
                            double diabetesPoint = input.nextDouble();

                            input.nextLine();
                            System.out.print("Enter doctor speciality: ");
                            String specialty = input.nextLine();

                            System.out.print("Enter Doctors consultation fee: ");
                            double fee = input.nextDouble();

                            OutdoorPatient  out = new OutdoorPatient(name, age, systolic, diastolic, diabetesPoint, specialty, fee);
                            patients.add(out);

                            input.nextLine();
                            
                        }
                        break;
                    case 2:
                        for(int i = 0 ;i<3 ;i++){

                            System.out.print("Enter patient name: ");
                            String name = input.nextLine();

                            System.out.print("Enter patient age: ");
                            int age = input.nextInt();

                            System.out.print("Enter systolic: ");
                            double systolic = input.nextDouble();

                            System.out.print("Enter diastolic: ");
                            double diastolic = input.nextDouble();

                            System.out.print("Enter diabetes point: ");
                            double diabetesPoint = input.nextDouble();

                            System.out.print("Enter the admission date: DD MM YYYY  ");
                            int day = input.nextInt();
                            int month = input.nextInt()-1;
                            int year = input.nextInt();

                        
                            

                            Calendar c = Calendar.getInstance();
                            c.set(year,month, day);

                            System.out.print("Enter bed No: ");
                            int bedNo= input.nextInt();

                            System.out.print("Enter daily fee: ");
                            double fee= input.nextDouble();

                            IndoorPatient in = new IndoorPatient(name, age, systolic, diastolic, diabetesPoint, c, bedNo, fee);

                            patients.add(in);

                            input.nextLine();
                        }
                        break;
                    case 3: 
                         Collections.sort(patients);
                        break;
                    case 4:
                        System.out.println();
                        System.out.println("These patient's Blood pressure are Low and High ");
                        printLowAndHighBloodPressurePatient();
                        break;
                    case 5:
                        System.out.println();
                        printAllInfo();
                    break;
                }
            }
        }

        input.close();
    }
}
