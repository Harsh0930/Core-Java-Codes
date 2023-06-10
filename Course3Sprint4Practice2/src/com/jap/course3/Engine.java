package com.jap.course3;

public class Engine {
    private String modelNo;
    private boolean displacement;
    private String maxPower;
    private int maxRpm;
    private int noOfCylinders;

    //constructor...
    public Engine(String modelNo,boolean displacement,String maxPower,int maxRpm,int noOfCylinders){
        this.modelNo=modelNo;
        this.displacement=displacement;
        this.maxPower=maxPower;
        this.maxRpm=maxRpm;
        this.noOfCylinders=noOfCylinders;
    }

    //getters...
    public String getModelNo(){
        return modelNo;
    }
    public boolean getDisplacement(){
        return displacement;
    }
    public String getMaxPower(){
        return maxPower;
    }
    public int getMaxRpm(){
        return maxRpm;
    }
    public int getNoOfCylinders(){
        return noOfCylinders;
    }

    //setters...
    public void setModelNo(String modelNo){
        this.modelNo=modelNo;
    }
    public void setDisplacement(boolean displacement){
        this.displacement=displacement;
    }
    public void setMaxPower(String maxPower){
        this.maxPower=maxPower;
    }
    public void setMaxRpm(int maxRpm){
        this.maxRpm=maxRpm;
    }
    public void setNoOfCylinders(int noOfCylinders){
        this.noOfCylinders=noOfCylinders;
    }

    public void displayDetails(){
        System.out.println("Engine Model No.: "+getModelNo());
        System.out.println("Engine displacement: "+getDisplacement());
        System.out.println("Engine Max Power: "+getMaxPower());
        System.out.println("Engine Max Rpm: "+getMaxRpm());
        System.out.println("No. of Cylinders in Engine: "+getNoOfCylinders());

    }

}
