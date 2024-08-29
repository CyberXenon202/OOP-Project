package Varsity;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;
import java.util.Collections;

public class Main {

    public static ArrayList<University> universities = new ArrayList<>();

    public static void printByUgcApproved(){
        for(University x: universities){
           if(x instanceof PrivateUniversity){
                PrivateUniversity obj=(PrivateUniversity)x;
                if(obj.isUgcApproved()== true){
                System.out.println(obj.getName());
                }
           }
        }
    }


    public static void printUniversityThatAreNotPoloctsAllowed(){
        for(University x: universities){
            if(x instanceof PublicUniversity){
                PublicUniversity obj= (PublicUniversity)x;
                if(obj.isPoliticsAllowed()==false){
                System.out.println(obj.getName());
                }
            }
        }
    }

    public static void printUniversiesByAddress(String s){
        for(University x: universities){
            if(x.getAddress().equals(s)){
                if(x instanceof PublicUniversity){
                    PublicUniversity p= (PublicUniversity)x;
                    System.out.println(p.getName());
                }
                else{
                    PrivateUniversity p2= (PrivateUniversity)x;
                    System.out.println(p2.getName());
                }
            }
            
        }
    }


    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add  Public University\n2. Add Private University\n"+
            "3. Sort based on established year\n4. Print by ugc approved\n5. Print Universities which are not allowed politics\n"+
            "6. Print university By an address\n7. Pritn all info\n8. Exit");
            int x= input.nextInt();
            input.nextLine();
            if(x==8){
                break;
            }
            else{
                switch (x) {
                    case 1:
                        for(int i=0; i<3; i++){
                            System.out.print("Enter Name: ");
                            String name= input.nextLine();
                
                            System.out.print("Enter address: ");
                            String address= input.nextLine();
                
                            System.out.print("Enter Established date: DD MM YYYY ");
                            int day= input.nextInt();
                            int month= input.nextInt()-1;
                            int year= input.nextInt();
                
                            System.out.print("Enter number of Departments: ");
                            int dept= input.nextInt();
                
                            System.out.print("Enter Number of Halls: ");
                            int hall= input.nextInt();
                
                            System.out.println("Politics Allowed ? Boolean ");
                            boolean politics= input.nextBoolean();
                            
                
                            Calendar c= Calendar.getInstance();
                            c.set(year, month,day);
                            input.nextLine();
                            
                            PublicUniversity obj= new PublicUniversity(hall, politics, name, address, c, dept);
                
                            universities.add(obj);
                        }
                        break;
                    case 2:
                        for(int i=0; i<3; i++){

                            System.out.println();
                            System.out.print("Enter Name: ");
                            String name= input.nextLine();
                
                            System.out.print("Enter address: ");
                            String address= input.nextLine();
                
                            System.out.print("Enter Established date: DD MM YYYY ");
                            int day= input.nextInt();
                            int month= input.nextInt()-1;
                            int year= input.nextInt();
                
                            System.out.print("Enter number of Departments: ");
                            int dept= input.nextInt();
                
                            System.out.println("UGC Approved ? Boolean ");
                            boolean ugc= input.nextBoolean();
                
                            System.out.print("Enter Number of NumberOfTrusteeMembers: ");
                            int members= input.nextInt();
                
                        
                
                            Calendar c= Calendar.getInstance();
                            c.set(year, month, day);
                            input.nextLine();
                
                            PrivateUniversity obj= new PrivateUniversity(ugc, members, name, address, c, dept);
                            
                            universities.add(obj);
                
                        }
                        break;
                    case 3: 
                        Collections.sort(universities);
                        break;
                    case 4:
                        System.out.println();
                        System.out.println("Print by ugc approved");
                        printByUgcApproved();
                        break;
                    case 5:
                        System.out.println();
                        System.out.println("These Universities are not allowed politics");
                        printUniversityThatAreNotPoloctsAllowed();
                        break;
                    case 6:
                        System.out.println();
                        System.out.print("Enter an address for printing university: ");
                        String ads= input.nextLine();
                        printUniversiesByAddress(ads);
                        break;
                    case 7:
                        for(University y: universities){
                
                            if(y instanceof PublicUniversity){
                                PublicUniversity p= (PublicUniversity)y;
                                System.out.println();
                                p.printAllInfo();
                            }
                            else{
                                PrivateUniversity p2= (PrivateUniversity)y;
                                System.out.println();
                                p2.printAllInfo();
                            }
                        }
                        break;

                }
            }
        }

        input.close();
    }
}
