package com.jap.course3;

public class BookImpl {
    public static void main(String[] args) {
        //Creating an object for Author class...and passing the constructor values
        Author author1=new Author("James Gosling","jamesgosling");
        //Creating an object for Book class...and passing the constructor values
        Book book1=new Book("Java Programming","BK2023","This book is for Java Fundamentals.",250.0,author1);
        //Creating an another object for Author class...and passing the constructor values
        Author author2=new Author("Yashwant","yashwant");
        //Creating an another object for Book class...and passing the constructor values
        Book book2=new Book("C++ Programming","BK212023","this book is for C++ Programming Fundamentals.",2000.0,author2);
        //calling the displayDetails method using object of Book class...Super/Parent class

        //setting the values to the setter methods...
        book2.setBookTitle("Let Us C");
        book2.setIsbnNumber("Bk20202023");
        book2.setBookDescription("This book is for C Programming Language.");
        book2.setBookPrice(2552.0);

        book1.displayDetails();
        System.out.println("---------------------------------------------------------------");
        book2.displayDetails();

        //toString method using the Author class object...Sub/Child class
        author1.toString();
        author2.toString();




    }

}
