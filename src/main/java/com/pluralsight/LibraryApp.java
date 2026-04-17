package com.pluralsight;

import java.util.Scanner;

public class LibraryApp {
    static Scanner scanner = new Scanner(System.in);
    static Book[] books = new Book[20];

    public static void main(String[] args) {

              books = new Book[]{
                new Book(1, "9780061120084", "To Kill a Mockingbird", false, ""),
                new Book(2, "9780451524935", "1984", false, ""),
                new Book(3, "9780141439518", "Pride and Prejudice", false, ""),
                new Book(4, "9780743273565", "The Great Gatsby", false, ""),
                new Book(5, "9781503280786", "Moby-Dick", false, ""),
                new Book(6, "9780316769488", "The Catcher in the Rye", false, ""),
                new Book(7, "9780618640157", "The Lord of the Rings", false, ""),
                new Book(8, "9780547928227", "The Hobbit", false, ""),
                new Book(9, "9780060850524", "Brave New World", false, ""),
                new Book(10, "9781451673319", "Fahrenheit 451", false, ""),
                new Book(11, "9780142437209", "Jane Eyre", false, ""),
                new Book(12, "9780066238500", "The Chronicles of Narnia", false, ""),
                new Book(13, "9780439023481", "The Hunger Games", false, ""),
                new Book(14, "9780590353427", "Harry Potter and the Sorcerer's Stone", false, ""),
                new Book(15, "9780061122415", "The Alchemist", false, ""),
                new Book(16, "9780375842207", "The Book Thief", false, ""),
                new Book(17, "9781594631931", "The Kite Runner", false, ""),
                new Book(18, "9780553593716", "A Game of Thrones", false, ""),
                new Book(19, "9780307474278", "The Da Vinci Code", false, ""),
                new Book(20, "9780156027328", "Life of Pi", false, "")
        };
        boolean programIsRunning = true;
        while(programIsRunning){
            System.out.print("""
                    Home screen
            
                    Choose an option:
                    1 - Show available books.
                    2 - Show checked out books.
                    3 - Exit home screen
                    
                    Enter command here: """);
            int command = scanner.nextInt();
            scanner.nextLine();
            switch(command){
                case 1 -> availableBooks();
                case 2 -> checkedOut();
                case 3 -> programIsRunning = false;
                default -> System.out.println("Invalid option. Try again!");

            }

        }








    }




        static void availableBooks(){
            int count = 0;
            for(Book book : books){
                if(book != null){
                    System.out.printf("ID: %d%n Isbn: %s%n Title: %s%n", book.getId(), book.getIsbn(),
                            book.getTitle());
                    count++;}

            }

        }


        static void checkedOut(){

        }










}


