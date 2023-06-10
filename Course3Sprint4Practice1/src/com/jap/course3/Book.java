package com.jap.course3;

public class Book {
    private String bookTitle;
    private String isbnNumber;
    private String bookDescription;
    private double bookPrice;
    Author author;

    //constructor...
    public Book(String bookTitle,String isbnNumber,String bookDescription,double bookPrice,Author author){
        this.bookTitle=bookTitle;
        this.isbnNumber=isbnNumber;
        this.bookDescription=bookDescription;
        this.bookPrice=bookPrice;
        this.author=author;
    }

    //getters...
    public String getBookTitle(){
        return bookTitle;
    }
    public String getIsbnNumber(){
        return isbnNumber;
    }
    public String getBookDescription(){
        return bookDescription;
    }
    public double getBookPrice(){
        return bookPrice;
    }

    //setters...
    public void setBookTitle(String bookTitle){
        this.bookTitle=bookTitle;
    }
    public void setIsbnNumber(String isbnNumber){
        this.isbnNumber=isbnNumber;
    }
    public void setBookDescription(String bookDescription){
        this.bookDescription=bookDescription;
    }
    public void setBookPrice(double bookPrice){
        this.bookPrice=bookPrice;
    }

    //method for displayDetails...
    public  void displayDetails(){
        System.out.println("Book Title: "+getBookTitle());
        System.out.println("Book ISBN Number: "+getIsbnNumber());
        System.out.println("Book Description: "+getBookDescription());
        System.out.println("Book Price: "+getBookPrice());
        System.out.println(author);
    }


}
