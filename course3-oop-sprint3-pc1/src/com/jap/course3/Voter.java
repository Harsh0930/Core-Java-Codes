package com.jap.course3;

public class Voter {
    private int age;
    private String name;
     public static final int VOTER_ELIGIBLE_AGE=18;

    //constructor...
    public Voter(){
        age=18;
        name="Harsh";
    }

    //getters..
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getAgeCriteria(){

        if(getAge()>=VOTER_ELIGIBLE_AGE){
//            System.out.println(getName()+" is Eligible to vote.");
            return getName()+" is Eligible to vote.";
        }else if (getAge()>0&&getAge()<VOTER_ELIGIBLE_AGE){
//            System.out.println(getName()+" is Not Eligible to vote.");
            return getName()+" is Not Eligible to vote.";
        } else {
            return "Age Can't be Negative or Zero.";
        }

    }

    //setters..
    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }


}
