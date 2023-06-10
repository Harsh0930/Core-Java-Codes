package com.jap.course3.test;

 public abstract class Sports {

    private String teamName;
    private String playerName;
    private int noOfPlayer;
    private String sportType;
    private String sportName;


    //constructor...
    public Sports(String sportType,String sportName,String teamName,String playerName,int noOfPlayer){
        this.sportType=sportType;
        this.sportName=sportName;
        this.teamName=teamName;
        this.playerName=playerName;
        this.noOfPlayer=noOfPlayer;
    }

    //getters...
    public String getSportType(){
        return sportType;
    }
    public String getSportName(){
        return sportName;
    }
    public String getTeamName(){
        return teamName;
    }
    public String getPlayerName(){
        return playerName;
    }
    public int getNoOfPlayer(){
        return noOfPlayer;
    }
    //setters...
    public void setSportType(String sportType){
        this.sportType=sportType;
    }
    public void setSportName(String sportName){
        this.sportName=sportName;
    }
    public void setTeamName(String teamName){
        this.teamName=teamName;
    }
    public void setPlayerName(String playerName){
        this.playerName=playerName;
    }
    public void setNoOfPlayer(int noOfPlayer){
        this.noOfPlayer=noOfPlayer;
    }

        public abstract void displayDetails();
        public abstract int calculateScore();

}
