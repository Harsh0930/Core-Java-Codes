package com.jap.course3;

public class VoterImpl {
    public static void main(String[] args) {
        Voter voter=new Voter();
        Voter voter1=new Voter();
        Voter voter2=new Voter();


        //accessing setter with the object of a class i.e.voter
        voter.setName("Rahul");
        voter.setAge(20);

        voter1.setAge(15);
        voter1.setName("Ram");

        //accessing getter method with the object of a class
        System.out.println(voter.getAgeCriteria());
        System.out.println(voter1.getAgeCriteria());
        System.out.println(voter2.getAgeCriteria());


    }
}
