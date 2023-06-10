package com.jap.course3;

public class ElectricEngine extends Engine{

    private String engineVariant;
    private int electricEngineVoltage;

    //constructor...
    public ElectricEngine(String modelNo,boolean displacement,String maxPower,int maxRpm,int noOfCylinders,String engineVariant,int electricEngineVoltage){
        super(modelNo, displacement, maxPower, maxRpm, noOfCylinders);
        this.engineVariant=engineVariant;
        this.electricEngineVoltage=electricEngineVoltage;
    }
    //getters...
    public String getEngineVariant() {
        return engineVariant;
    }
    public int getElectricEngineVoltage(){
        return electricEngineVoltage;
    }
    //setters...
    public void setEngineVariant(String engineVariant){
        this.engineVariant=engineVariant;
    }
    public void setElectricEngineVoltage(int electricEngineVoltage){
        this.electricEngineVoltage=electricEngineVoltage;
    }
    //displayDetails...
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Electric engine voltage: "+getElectricEngineVoltage());
    }
}
