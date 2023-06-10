package com.jap.course3;

public class FurnitureItemImpl {
    public static void main(String[] args) {
        FurnitureItem furniture=new FurnitureItem();
        //accessing the setter methods with the object of FurnitureItem class...
        furniture.setFurnitureCode(001);
        furniture.setFurniturePrice(5100);
        furniture.setFurnitureType("Chair");
        furniture.setFurnitureUsage("outdoor");
        furniture.setGradeOfFurniture("grade1");

        //accessing the getter methods with the object of FurnitureItem class
        System.out.println("Discounted Price is:"+" $"+furniture.calculateDiscount(FurnitureItem.DISCOUNT));

    }

}
