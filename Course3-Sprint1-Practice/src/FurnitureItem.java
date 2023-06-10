public class FurnitureItem {

    String color;
    String grade;

    String item;

    int priceOfFurniture;
    String furnitureType;


    double calcDiscount(int discPerc){
        double discountedAmount=0.0;
        double total=0.0;
        if (furnitureType.equalsIgnoreCase("outdoor")){
            discountedAmount=priceOfFurniture-(priceOfFurniture*discPerc/100);

        }else if (furnitureType.equalsIgnoreCase("indoor")){
            return  priceOfFurniture;
        }
        return  discountedAmount;
    }
    public static void main(String[] args) {
        FurnitureItem furniture=new FurnitureItem();
        furniture.furnitureType="outdoor";
        furniture.color="Yellow";
        furniture.grade="Grade A1";
        furniture.item="chair";
        furniture.priceOfFurniture=1000;
        System.out.println("Discounted Amount for Outdoor Furniture Items is: "+furniture.calcDiscount(5));
    }

}
