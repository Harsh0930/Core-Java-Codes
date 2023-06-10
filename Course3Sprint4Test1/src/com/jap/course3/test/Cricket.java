package com.jap.course3.test;

public class Cricket extends Sports{

    private int singleRun;
    private int doubleRun;
    private int six;
    private int wicketsDown;
    private double runRate;
    private int overFaced;


    //constructor...
    public Cricket(String sportType,String sportName,String teamName,String playerName,int noOfPlayer,int wicketsDown,int six,int singleRun,int doubleRun,double runRate,int overFaced){
        super(sportType, sportName, teamName, playerName,noOfPlayer);
        this.wicketsDown=wicketsDown;
        this.runRate=runRate;
        this.overFaced=overFaced;
        this.six=six;
        this.doubleRun=doubleRun;
        this.singleRun=singleRun;
    }

    //getters...

    public  int getWicketsDown(){
        return wicketsDown;
    }

    public int getSingleRun(){
        return singleRun;
    }
    public int getSix(){
        return six;
    }
    public int getDoubleRun(){
        return doubleRun;
    }
    public double getRunRate(){
        return runRate;
    }

    //setters...
    public void setWicketsDown(int wicketsDown){
        this.wicketsDown=wicketsDown;
    }

    public void setRunRate(double runRate){
        this.runRate=runRate;
    }
    public void setSingleRun(int singleRun){
        this.singleRun=singleRun;
    }
    public void setDoubleRun(int doubleRun){
        this.doubleRun=doubleRun;
    }
    public void setSix(int six){
        this.six=six;
    }

    //toString...
    @Override
    public String toString(){
        return "Cricket {"+"Single Runs: "+ getSingleRun()+", Double Runs: "+getDoubleRun()+", Six: "+getSix()+'}';
    }


    //calculateScore...
    public int calculateScore(){
        return getSix()+getDoubleRun()+getSingleRun();
    }

    //displayDetails..
    public void displayDetails(){
        System.out.println("Sports Name: "+getSportName());
        System.out.println("Sport type: "+getSportType());
        System.out.println("Team name: "+getTeamName());
        System.out.println("No of Players: "+getNoOfPlayer());
        System.out.println("Player Name: "+getPlayerName());
        System.out.println("Run Rate: "+getRunRate());
        System.out.println("Wicket Down: "+getWicketsDown());
    }

}
