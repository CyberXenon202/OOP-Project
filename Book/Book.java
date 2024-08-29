import java.util.ArrayList;

public class Book{
    private int ISBN;
    private String bookTitle;
    private int numberOfPages;
    private static int count;

    // Constructor
    public Book(){

    }
    public Book(int ISBN, String bookTitle, int numberOfPages)
    {
        this.ISBN=ISBN;
        this.bookTitle= bookTitle;
        this.numberOfPages=numberOfPages;
        count++;
    }


    //Get method
    public int getISBN(){
        return this.ISBN;
    }
    public String getBookTitle(){
        return this.bookTitle;
    }
    public int getNumberOfPages(){
        return this.numberOfPages;
    }
    public static int getCount(){
        return count;
    }



    //Equal check
    public boolean equalCheck(Book b){
        if(this.ISBN==b.ISBN && this.bookTitle.equals(b.bookTitle) 
        && this.numberOfPages==b.numberOfPages)
        return true;
        else return false;
    }


    //Compare
    public int compareTo(Book b){
        if(this.getNumberOfPages()>b.getNumberOfPages())
        return 1;
        else if(this.getNumberOfPages()==b.getNumberOfPages())
        return 0;
        else 
            return -1;
    }



    // Find max Book
    public static void findMaxBook(ArrayList<Book> books)
    {
        Book max= books.get(0);
        for(Book x: books)
        {
            if(max.getNumberOfPages()<x.getNumberOfPages())
            {
                max=x;
            }
        }
        System.out.println(max.toString());
    }


    //Heavier method
    public static boolean isHeavier(Book b){
        if(b.getNumberOfPages()>=500)
            return true;
        else 
        return false;
    }


    //Display
    public String toString(){
        return "ISBN "+this.ISBN + ", Title " + this.bookTitle + ", Page " + this.numberOfPages;
    }
}