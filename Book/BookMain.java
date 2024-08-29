
import java.util.Scanner;
import java.util.ArrayList;

public class BookMain {

    public static ArrayList<Book> books= new ArrayList<>();

    //Check Already exist or not
    public static boolean alreadyExists(Book b)
    {
        boolean flag=false;
        for(Book x: books)
        {
            if(x.equalCheck(b))
            {
                flag=true;
                break;
            }
        }
        return flag;
    }

    

    // Display method
    public static void displayAll(ArrayList<Book> books)
    {
        for(Book x: books)
        {
            System.out.println(x.toString());
        }
    }


    //Main
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        while (true) {
            System.out.println("1. Entry\n0. Exit");
            int x = input.nextInt();
            if (x == 0) {
                break;
            } else if (x == 1) {
                System.out.print("ISBN: ");
                int isbn = input.nextInt();

                input.nextLine();
                System.out.print("BookTitle: ");
                String title = input.nextLine();

                System.out.print("Number of Page: ");
                int page = input.nextInt();

                Book b= new Book(isbn, title, page);
                
                if (alreadyExists(b)) {
                    System.out.println("The book already exists in the arraylist!");
                } else {
                    books.add(b);
                    System.out.println("Item added successfully!");
                }
            }
        }


        //display method call
        System.out.println("After adding: ");
        displayAll(books);


        Book b1=books.get(0);
        Book b2=books.get(1);

        //Compare method call
        int r=b1.compareTo(b2);
        if(r==1)
            System.out.println("Max coller");
        else if(r==-1)
            System.out.println("Max called");
        else
            System.out.println("Caller and Called are equal");


        // max method call
        Book.findMaxBook(books);


        //Heavier method call
        System.out.println(Book.isHeavier(b2));
        
        input.close();
    }
    
}
