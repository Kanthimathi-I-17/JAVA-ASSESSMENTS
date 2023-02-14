package BookDetails;

import java.util.Scanner;

public class BookInfo {
    Scanner sc = new Scanner(System.in);
    public String bookName, authorName;
    public double bookPrice;
    public void getBookInfo(){
        System.out.print("Enter the Book Name: ");
        bookName = sc.next();

        System.out.print("Enter the Price of the Book: ");
        bookPrice = sc.nextDouble();

        System.out.print("Enter the Author Name: ");
        authorName = sc.next();
    }
    public void showBookDetails(){
        System.out.println("************* BOOK DETAILS *************");
        System.out.println("Book Name: " + bookName);
        System.out.println("Author Name: " + authorName);
        System.out.println("Price: " + bookPrice);
    }
}
