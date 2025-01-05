package week7;

import java.util.*;

public class BookManager {

    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<Book>();
        HashMap<Book, Integer> bookShelfMap = new HashMap<>();

        Scanner input = new Scanner(System.in);

        while(true){
            System.out.println("\nMenu");
            System.out.println("1. Add a Book");
            System.out.println("2. Display Books");
            System.out.println("3. Map books to shelves");
            System.out.println("4. Display books on a Specific Shelf");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = input.nextInt();
            input.nextLine(); //clear input

            switch (choice){
                case 1:
                    System.out.println("Enter title:");
                    String title = input.nextLine();
                    System.out.println("Enter year:");
                    int year = input.nextInt();
                    input.nextLine(); // Consume newline
                    System.out.println("Enter author:");
                    String author = input.nextLine();
                    System.out.println("Enter price:");
                    double price = input.nextDouble();

                    Book book = new Book(title, year, author);
                    book.setPrice(price);
                    books.add(book);
                    break;

                case 2:
                    System.out.println("\nBooks in the list");
                    Collections.sort(books); //sort by year
                    for (Book b : books){
                        System.out.println(b);
                    }
                    break;

                case 3:
                    if (books.isEmpty()){
                        System.out.println("No books to map, Add books first");
                    } else {
                        for (Book bookToMap : books){
                            System.out.println("Enter shelf number for " + bookToMap.getTitle() + ":");
                            int shelfNumber = input.nextInt();
                            bookShelfMap.put(bookToMap, shelfNumber);
                        }
                        System.out.println("Book have been mapped to shelves.");
                    }
                    break;

                case 4:
                    if (bookShelfMap.isEmpty()){
                        System.out.println("No books have been mapped to shelves yet. Please map books first.");
                    } else {
                        System.out.println("Enter the shelf number to retrieve book");
                        int selectedShelf = input.nextInt();

                        System.out.println("Books on shelf " + selectedShelf + "are :");
                        boolean found = false;

                        for (Map.Entry<Book, Integer> entry : bookShelfMap.entrySet()){
                            if (entry.getValue()==selectedShelf){
                                System.out.println(entry.getKey());
                                found = true;
                            }
                        }
                        if (!found){
                            System.out.println("No books found on this shelf");
                        }
                    }
                    break;

                case 5:
                    System.out.println("Exiting...");
                    input.close();
                    return;

                default:
                    System.out.println("Invalid choice try again.");
            }
        }
    }


}
