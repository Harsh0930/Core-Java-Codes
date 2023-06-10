public class FurnitureItemImpl {
    public static void main(String[] args) {
        FurnitureItem furniture=new FurnitureItem();
        furniture.displayDetails();
        System.out.println("Discounted Amount: "+furniture.calculateDiscount(5));
    }
}
