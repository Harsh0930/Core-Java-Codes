package com.jap.course3;

public abstract class Transmission {
    private String modelNumber;
    private int forwardGears;
    private double gearOne;
    private double gearTwo;
    private double gearThree;
    private double gearFour;
    private double gearFive;
    private double gearSix;

    //constructor...
    public Transmission(String modelNumber,int forwardGears,double gearOne,double gearTwo,double gearThree,double gearFour){
        this.modelNumber=modelNumber;
        this.forwardGears=forwardGears;
        this.gearOne=gearOne;
        this.gearTwo=gearTwo;
        this.gearThree=gearThree;
        this.gearFour=gearFour;
    }
    public Transmission(String modelNumber,int forwardGears,double gearOne,double gearTwo,double gearThree,double gearFour,double gearFive){
        this.modelNumber=modelNumber;
        this.forwardGears=forwardGears;
        this.gearOne=gearOne;
        this.gearTwo=gearTwo;
        this.gearThree=gearThree;
        this.gearFour=gearFour;
        this.gearFive=gearFive;
    }
    public Transmission(String modelNumber,int forwardGears,double gearOne,double gearTwo,double gearThree,double gearFour,double gearFive,double gearSix){
        this.modelNumber=modelNumber;
        this.forwardGears=forwardGears;
        this.gearOne=gearOne;
        this.gearTwo=gearTwo;
        this.gearThree=gearThree;
        this.gearFour=gearFour;
        this.gearFive=gearFive;
        this.gearSix=gearSix;
    }

    //getter methods...
    public String getModelNumber(){
        return modelNumber;
    }
    public int getForwardGears(){
        return forwardGears;
    }
    public double getGearOne(){
        return gearOne;
    }
    public double getGearTwo(){
        return gearTwo;
    }
    public double getGearThree(){
        return gearThree;
    }
    public double getGearFour(){
        return gearFour;
    }
    public double getGearFive(){
        return gearFive;
    }
    public double getGearSix(){
        return gearSix;
    }

    //setter methods...
    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    public void setForwardGears(int forwardGears) {
        this.forwardGears = forwardGears;
    }

    public void setGearOne(double gearOne) {
        this.gearOne = gearOne;
    }

    public void setGearTwo(double gearTwo) {
        this.gearTwo = gearTwo;
    }

    public void setGearThree(double gearThree) {
        this.gearThree = gearThree;
    }

    public void setGearFour(double gearFour) {
        this.gearFour = gearFour;
    }

    public void setGearFive(double gearFive) {
        this.gearFive = gearFive;
    }

    public void setGearSix(double gearSix) {
        this.gearSix = gearSix;
    }

    //showSpecs()...
    public abstract void showSpecs();
}
