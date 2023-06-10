package com.jap.course3;

public class FurnitureItem {

    private int furnitureCode;
    private String furnitureType;
    private String gradeOfFurniture;
    private String furnitureUsage;
    private int furniturePrice;

    public static final int DISCOUNT=5;

    //constructor..
    public FurnitureItem()
    {
        furnitureCode=001;
        furnitureType="Chair";
        gradeOfFurniture="grade1";
        furnitureUsage="Outdoor";
        furniturePrice=1000;
    }

    //getters..
    public int getFurnitureCode(){
        return furnitureCode;
    }
    public String getFurnitureType(){
        return furnitureType;
    }
    public String getGradeOfFurniture(){
        return gradeOfFurniture;
    }
    public String getFurnitureUsage(){
        return furnitureUsage;
    }
    public int getFurniturePrice(){
        return furniturePrice;
    }

    //setters...
    public void setFurnitureCode(int furnitureCode){
        this.furnitureCode=furnitureCode;
    }
    public void setFurnitureType(String furnitureType){
        this.furnitureType=furnitureType;
    }
    public void setFurnitureUsage(String furnitureUsage){
        this.furnitureUsage=furnitureUsage;
    }
    public void setGradeOfFurniture(String gradeOfFurniture){
        this.gradeOfFurniture=gradeOfFurniture;
    }
    public void setFurniturePrice(int furniturePrice){
        this.furniturePrice=furniturePrice;
    }



    //discount method..
    public float calculateDiscount(int DISCOUNT){
        if (getGradeOfFurniture().equalsIgnoreCase("grade1")&&getFurnitureUsage().equalsIgnoreCase("Outdoor")){
            float discountedAmount=getFurniturePrice()-(getFurniturePrice()*FurnitureItem.DISCOUNT/100);
            return discountedAmount;
        }else {
            return getFurniturePrice();
        }
    }

}
