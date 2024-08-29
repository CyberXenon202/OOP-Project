
import java.util.Scanner;
import java.util.ArrayList;

public class IceCreamMain {
    public static ArrayList<Icecream> icecreams = new ArrayList<Icecream>();

    // Duplicate check
    public static boolean alreadyExists(Icecream I) {
        boolean flag = false;
        for (Icecream x : icecreams) {
            if (x.equals(I)) {
                flag = true;
                break;
            }
        }
        return flag;
    }

    // Max price find
    public static Icecream findMaxIcecream() {
        Icecream max = icecreams.get(0);
        for (Icecream x : icecreams) {
            if (x.getIcecreamPrice() > max.getIcecreamPrice()) {
                max = x;
            }
        }
        return max;
    }

    // company based Display
    public static void printByCompany(String comapny) {
        for (Icecream x : icecreams) {
            if (x.getIcecreamCompany().equals(comapny)) {
                System.out.println(x.toString());
            }
        }
    }

    // Shorting basis price
    public static void sortByPrice() {
        for (int i = 0; i < icecreams.size(); i++) {
            for (int j = i; j < icecreams.size(); j++) {
                if (icecreams.get(i).getIcecreamPrice() > icecreams.get(j).getIcecreamPrice() ){
                    Icecream temp = icecreams.get(i);
                    icecreams.set(i, icecreams.get(j));
                    icecreams.set(j, temp);
                }
            }
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Icecream I1 = new Icecream("Vanilla", "Polar", 250.0);
        // Icecream I2 = new Icecream("Vanilla", "Igloo", 280.0);
        // System.out.println(I1.compareTo(I2));

        while (true) {
            System.out.println("1. Entry\n0. Exit");
            int x = input.nextInt();
            if (x == 0) {
                break;
            } else if (x == 1) {
                System.out.println("Type: ");
                String type = input.next();
                System.out.println("Company: ");
                String company = input.next();
                System.out.println("Price: ");
                double price = input.nextDouble();
                Icecream I = new Icecream(type, company, price);
                if (alreadyExists(I)) {
                    System.out.println("The item already exists in the arraylist!");
                } else {
                    icecreams.add(I);
                    System.out.println("Item added successfully!");
                }
            }
        }

        //Before shortin
        System.out.println("Before Shorting: ");
        for (Icecream I : icecreams) {
            System.out.println(I.toString());
        }

        //Find max
        System.out.println();
        System.out.println("The max: "+findMaxIcecream().toString());


        //Search according to company
        System.out.println("Enter the comapny name you want to search: ");
        String company = input.next();
        printByCompany(company);

        // method call and print
        sortByPrice();


        //print after shorting
        System.out.println();
        System.out.println("After shorting: ");
        for (Icecream p : icecreams) {
            System.out.println(p.toString());
        }
    }
}
