//Create a class Author with the following information.
//Member variables : name (String), email (String), and gender (char)
//  Parameterized Constructor: To initialize the variables.
//Create a class Book with the following information. Member variables : name (String), 
// author (of the class Author you have just created), price (double), and qtyInStock (int)
//Assumption: Each book will be written by exactly one Author]
//Parameterized Constructor: To initialize the variables Getters and Setters for all the member variables
//In the main method, create a book object and print all details of the book (including the author details)

class Author {
    String name, email;
    char gender;

    Author(String n, String e, char g) {
        this.name = n;
        this.email = e;
        this.gender = g;
    }
}

class Book {
    String name;
    Author author;
    double price;
    int qtyInStock;

    Book(String n, Author a, double p, int qtyinstk) {
        this.name = n;
        this.author = a;
        this.price = p;
        this.qtyInStock = qtyinstk;
    }
}

public class Result{
    public static void main(String[] args) {
      Author a = new Author("Karthik", "Karthik1204@gmail.com", 'M');
  Book b = new Book("Java", a, 200, 15);
     System.out.println("Book: " + b.name);
        System.out.println("Price: " + b.price);
        System.out.println("Stock: " + b.qtyInStock);
        System.out.println("Autohr: " + b.author.name);
        System.out.println("Email: " + b.author.email);
        System.out.println("Gender: " + b.author.gender);
    }
}