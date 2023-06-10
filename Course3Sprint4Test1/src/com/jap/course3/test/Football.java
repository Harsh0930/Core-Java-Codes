package com.jap.course3.test;

public class Football extends Sports {

    private int goalDown;

    //constructor...
    public Football(String sportType,String sportName,String teamName,String playerName,int noOfPlayer,int goalDown){
        super(sportType, sportName, teamName, playerName,noOfPlayer);
        this.goalDown=goalDown;
    }

    //getter...
    public int getGoalDown(){
        return goalDown;
    }

    //setters...
    public void setGoalDown(int goalDown){
        this.goalDown=goalDown;
    }

    //toString...
    @Override
    public String toString(){
        return "Football Score: {"+"Goals Down: "+ getGoalDown()+'}';
    }

    @Override
    public void displayDetails() {
        System.out.println("Sports Name: "+getSportName());
        System.out.println("Sport type: "+getSportType());
        System.out.println("Team name: "+getTeamName());
        System.out.println("No of Players: "+getNoOfPlayer());
        System.out.println("Player Name: "+getPlayerName());
        System.out.println("Goals Down: "+getGoalDown());
    }

    //calculateScore...
    public int calculateScore(){
        return getGoalDown();
    }


}
