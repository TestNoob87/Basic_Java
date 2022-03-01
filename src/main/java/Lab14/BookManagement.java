package Lab14;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookManagement {

    public static void main(String[] args) {
        List<Book> bookList = new ArrayList<>();

        // Input Book
        Scanner scanner = new Scanner(System.in);
        System.out.print("ISBN: ");
        String ISBN = scanner.nextLine();
        System.out.print("Book Title: ");
        String title = scanner.nextLine();
        System.out.print("Book Author: ");
        String author = scanner.nextLine();
        System.out.print("Year of Book: ");
        int year = Integer.parseInt(scanner.nextLine());

        // Save book Data storage
        Book book = new Book(ISBN, title, author, year);
        bookList.add(book);

        String bookFilePath = System.getProperty("user.dir").concat("Lab.txt");
        DataFactory.saveBookList(bookList, bookFilePath);

      /*  // Retrieve Book
        System.out.print("Book ISBN to find: ");
        String ISBNtoFind = scanner.nextLine();
        Book foundBook = null;

        for (Book bookitem : bookList) {
            if (bookitem.getISBN().equals(ISBNtoFind)) {
                foundBook = bookitem;
                break;
            }
        }

        if (foundBook == null) {
            System.out.println("No ISBN Book in Library with " + ISBNtoFind);
        } else {
            System.out.println(foundBook);
        }*//**/
    }
}