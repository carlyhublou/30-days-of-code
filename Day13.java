//For a description of the task, see: https://www.hackerrank.com/challenges/30-abstract-classes

//Provided
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

//This is what I wrote:

class MyBook extends Book{
    int price;
    
    MyBook(String title, String author, int price){
        super(title, author);
        this.price = price;
    }
    
    void display(){
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
 
}

//Provided
public class Solution {
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();
        String author = scanner.nextLine();
        int price = scanner.nextInt();
        scanner.close();

        Book book = new MyBook(title, author, price);
        book.display();
    }
}
