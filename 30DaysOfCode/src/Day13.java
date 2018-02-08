//public class Day13 {
import java.util.*;

abstract class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    abstract void display();
}
class MyBook extends Book{ // Declare your class here. Do not use the 'public' access modifier.
    int price;// Declare the price instance variable

    /**
     *   Class Constructor
     *
     *   @param title The book's title.
     *   @param author The book's author.
     *   @param price The book's price.
     **/
    MyBook(String title, String author, int price){
        super(title, author);
        this.price = price;// Write your constructor here
    }
    /**
     *   Method Name: display
     *
     *   Print the title, author, and price in the specified format.
     **/
    // Write your method here
    void display(){
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }

}// End class
}
