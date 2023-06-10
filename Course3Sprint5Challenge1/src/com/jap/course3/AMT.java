package com.jap.course3;

public class AMT extends Transmission {
    private String typeOfTransmission;

    //constructor...
    public AMT(String modelNumber, int forwardGears, double gearOne, double gearTwo, double gearThree, double gearFour,String typeOfTransmission) {
        super(modelNumber, forwardGears, gearOne, gearTwo, gearThree, gearFour);
        this.typeOfTransmission=typeOfTransmission;
    }

    public AMT(String modelNumber, int forwardGears, double gearOne, double gearTwo, double gearThree, double gearFour, double gearFive,String typeOfTransmission) {
        super(modelNumber, forwardGears, gearOne, gearTwo, gearThree, gearFour, gearFive);
        this.typeOfTransmission=typeOfTransmission;
    }

    public AMT(String modelNumber, int forwardGears, double gearOne, double gearTwo, double gearThree, double gearFour, double gearFive, double gearSix,String typeOfTransmission) {
        super(modelNumber, forwardGears, gearOne, gearTwo, gearThree, gearFour, gearFive, gearSix);
        this.typeOfTransmission=typeOfTransmission;
    }

    //getter methods...
    public String getTypeOfTransmission(){
        return typeOfTransmission;
    }

    //setter methods...
    public void setTypeOfTransmission(String typeOfTransmission){
        this.typeOfTransmission=typeOfTransmission;
    }

    //showSpecs() method...
    public void showSpecs(){
        if (getTypeOfTransmission().equalsIgnoreCase("AMT")&&getModelNumber().equalsIgnoreCase("AMTP4")){
            System.out.println(getModelNumber()+" model will have the specifications displayed as: ");
            System.out.println("Transmission Type: "+getTypeOfTransmission());
            System.out.println("Transmission Model Number: "+getModelNumber()+"\n");
            System.out.println("Key Specifications: ");
            System.out.println("1. Forward Gear: "+getForwardGears());
            System.out.println("2. 1st Gear: "+getGearOne());
            System.out.println("3. 2nd Gear: "+getGearTwo());
            System.out.println("4. 3rd Gear: "+getGearThree());
            System.out.println("5. 4th Gear: "+getGearFour());
        }else if (getTypeOfTransmission().equalsIgnoreCase("AMT")&&getModelNumber().equalsIgnoreCase("AMTD5")){
            System.out.println(getModelNumber()+" model will have the specifications displayed as: ");
            System.out.println("Transmission Type: "+getTypeOfTransmission());
            System.out.println("Transmission Model Number: "+getModelNumber()+"\n");
            System.out.println("Key Specifications: ");
            System.out.println("1. Forward Gear: "+getForwardGears());
            System.out.println("2. 1st Gear: "+getGearOne());
            System.out.println("3. 2nd Gear: "+getGearTwo());
            System.out.println("4. 3rd Gear: "+getGearThree());
            System.out.println("5. 4th Gear: "+getGearFour());
            System.out.println("6. 5th Gear: "+getGearFive());
        }else {
            System.out.println("Invalid input!!!");
        }
    }
}

