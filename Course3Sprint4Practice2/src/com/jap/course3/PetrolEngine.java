package com.jap.course3;

public class PetrolEngine extends Engine {
    private String engineVariant;

    //constructor...
    public PetrolEngine(String modelNo,boolean displacement,String maxPower,int maxRpm,int noOfCylinders,String engineVariant){
        super(modelNo,displacement,maxPower,maxRpm,noOfCylinders);
        this.engineVariant=engineVariant;
    }

    //getters...
    public String getEngineVariant(){
        return engineVariant;
    }
    //setters...
    public void setEngineVariant(String engineVariant){
        this.engineVariant=engineVariant;
    }

    //displayDetails...
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Engine variant: "+getEngineVariant());
    }
}
