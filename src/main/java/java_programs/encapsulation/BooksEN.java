package java_programs.encapsulation;
import java.security.Key;
import java.util.*;

//Write a program to store 5 books, print details of all books and show the
//details based on a given book id.

class Books{
    private String  bookId;
    private  String bookTitle;
    private  String bookAuthor;

    public void setData(String id, String title, String  author){
        bookId = id;
        bookTitle = title;
        bookAuthor = author;
    }
    public List getData(){
        List<String> myList = new ArrayList<String>();

        myList.add(bookId);
        myList.add(bookTitle);
        myList.add(bookAuthor);
        return myList;
    }
}
public class BooksEN {
    public static void main(String[] args) {

        String[] idArray = {"43","76","23","87","66"};
        String[] titleArray = {"richard","arjun","amal","vaishnav","muhammed"};
        String[] authorArray = {"J. K. Rowling","J. K. Rowling","J. K. Rowling","J. K. Rowling","J. K. Rowling"};


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the book ID to search: ");
        String input = sc.nextLine();

        Books mybooks = new Books();
        List<Books> bookList = new ArrayList<Books>();

        for(int i=0;i<idArray.length;i++){
            mybooks.setData(idArray[i],titleArray[i],authorArray[i]);
            bookList.add(mybooks);

            List<String> entries = bookList.get(i).getData();

            if(entries.contains(input)){
                for(String singleEntry : entries)
                    System.out.println(singleEntry);
                break;
            }else {
                if(i == idArray.length -1){
                    System.out.println("Error! Could not find details");
                }
            }
        }

    }
}
