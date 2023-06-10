package com.jap.course3.test;

public class SportImpl {

    public static void main(String[] args) {
        Cricket cricket=new Cricket("Outdoor","Cricket","India","Virat Kohli",11,3,4,2,5,3.2,12);
        cricket.displayDetails();
        System.out.println(cricket.toString());
        System.out.println("Cricket Score: "+cricket.calculateScore());

        System.out.println("---------------------------------------------------");

        Football football=new Football("Outdoor","Football","Argentina","Messi",11,4);
        football.displayDetails();
        System.out.println(football.toString());
        System.out.println("Football Score: "+football.calculateScore());

    }

}
