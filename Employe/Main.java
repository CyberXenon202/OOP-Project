package Employe;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    
    public static ArrayList<Employee> employees= new ArrayList<>();

    // Already exist check
    public static boolean AlreadyExist(int id){
        boolean flag= false;
        for(Employee x: employees){
            if(x.getId()==id){
                flag= true;
                break;
            }
        }
        return flag;
    }


    // print All employe's details
    public static void printAllInfo(){
        for(Employee x: employees){
            if(x instanceof FullTiemEmployee){
                FullTiemEmployee fe= (FullTiemEmployee)x;
                System.out.println("FullTime");
                System.out.println(fe.toString());
            }
            else{
                PartTimeEmployee pe=(PartTimeEmployee)x;
                System.out.println("PartTime");
                System.out.println(pe.toString());
            }
        }
    }


    // Print info according to Specific year
    public static void printByYear(int year){
        for(Employee x: employees){
            if(x.getDateOfBirth().get(Calendar.YEAR)==year){
               if(x instanceof FullTiemEmployee){
                    FullTiemEmployee fe= (FullTiemEmployee)x;
                    System.out.println(fe.toString());
                }
                else{
                    PartTimeEmployee pe=(PartTimeEmployee)x;
                    System.out.println(pe.toString());
                }
            }
        }
    }


    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add FUllTime employee\n2. Add PartTime employee\n"+
            "3. Print all information\n4. Print By year\n5. Sort according to salary\n6. Exist");
            int x= input.nextInt();
            input.nextLine();
            if(x==6){
                break;
            }
            else{
                switch (x) {
                    case 1:
                        for(int i=0; i<3; i++){

                            System.out.print("Enter Name: ");
                            String name= input.nextLine();

                            System.out.print("Enter Id: ");
                            int id= input.nextInt();

                            System.out.print("Enter DOB: DD MM YYYY ");
                            int day= input.nextInt();
                            int month= input.nextInt()-1;
                            int year= input.nextInt();

                            System.out.print("Enter Monthly Salary: ");
                            int salary= input.nextInt();        

                            Calendar c= Calendar.getInstance();
                            c.set(year, month, day);
                            input.nextLine();
                            
                        
                            if(AlreadyExist(id)==true){
                                System.out.println("Already Exist!!!");
                                i--;
                            }
                            else{
                                FullTiemEmployee obj= new FullTiemEmployee(name, id, c, salary);
                                employees.add(obj);
                            }
                        }
                        break;
                    case 2:
                        for(int i=0; i<3; i++){

                            System.out.print("Enter Name: ");
                            String name= input.nextLine();

                            System.out.print("Enter Id: ");
                            int id= input.nextInt();

                            System.out.print("Enter DOB: DD MM YYYY ");
                            int day= input.nextInt();
                            int month= input.nextInt()-1;
                            int year= input.nextInt();

                            Calendar c= Calendar.getInstance();
                            c.set(year, month, day);

                            System.out.print("Enter Hour: ");
                            int hour= input.nextInt(); 
                            
                            System.out.print("Enter Hourly Rate: ");
                            double rate= input.nextDouble();

                            if(AlreadyExist(id)==true){
                                System.out.println("Already Exist!!!");
                                i--;
                            }
                            else{
                                PartTimeEmployee p= new PartTimeEmployee(name, id, c, hour, rate);
                                employees.add(p);
                            }
                        input.nextLine();
                        }
                        break;
                    case 3: 
                        System.out.println();
                        printAllInfo();
                        break;
                    case 4:
                        System.out.println("Enter a year");
                        int year= input.nextInt();
                        System.out.println();
                        printByYear(year);
                        break;
                    case 5:
                        Collections.sort(employees);

                        System.out.println("After Sort");
                        for(Employee y: employees){
                            System.out.println(y.toString());
                        }
                    break;
                }
            }
        }

        input.close();
    }
}
