public class FurnitureItem {
    int furnitureCode;
    String furnitureType;
    String gradeOfFurniture;
    String color;
    String furnitureUsage;
    int price;


    //Constructor...
    public FurnitureItem(){
        furnitureCode=001;
        furnitureType="Chair";
        gradeOfFurniture="Grade 1";
        color="Red";
        furnitureUsage="indoor";
        price=1250;
    }


    //displayDetails...
    public void displayDetails(){
        System.out.println("Furniture Code: "+furnitureCode);
        System.out.println("Furniture Type: "+furnitureType);
        System.out.println("Furniture Grade: "+gradeOfFurniture);
        System.out.println("Furniture Color: "+color);
        System.out.println("Furniture Usage: "+furnitureUsage);
        System.out.println("Furniture Price: "+price);
    }


    //behaviour calculateDiscount...
    public double calculateDiscount (int discPerc)
    {
        if(furnitureUsage.equalsIgnoreCase("outdoor")){
            return price-(price*discPerc/100);
        }
        else if(furnitureUsage.equalsIgnoreCase("indoor")){
            return price-(price*discPerc/100);
        }else {
            return price;
        }
    }
}
