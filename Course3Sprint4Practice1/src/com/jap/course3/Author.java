package com.jap.course3;

public class Author {

     String authorName;
     String authorPenName;

     public Author(String authorName,String authorPenName){
          this.authorName=authorName;
          this.authorPenName=authorPenName;
     }

     //toString author method...
     @Override
     public  String toString(){
          return "Author: {"+ "Author Name: "+ authorName+ " , Author Pen Name: "+ authorPenName +"}";

     }
}
