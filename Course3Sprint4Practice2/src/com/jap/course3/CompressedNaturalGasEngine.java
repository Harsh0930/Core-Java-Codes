package com.jap.course3;

public class CompressedNaturalGasEngine extends Engine {
    private String engineVariant;

    //constructor...
    public CompressedNaturalGasEngine(String modelNo,boolean displacement,String maxPower,int maxRpm,int noOfCylinders,String engineVariant){
        super(modelNo, displacement, maxPower, maxRpm, noOfCylinders);
        this.engineVariant=engineVariant;
    }
    //getters...
    public String getEngineVariant(){
        return engineVariant;
    }
    //setters..
    public void setEngineVariant(String engineVariant){
        this.engineVariant=engineVariant;
    }
    //displayDetails...
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Engine Variant: "+getEngineVariant());
    }

}
