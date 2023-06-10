package com.jap.course3;

public class EngineImpl {
    public static void main(String[] args) {

        PetrolEngine petrol=new PetrolEngine("EN2121212022",true,"2000CC",5000,6,"Petrol");
        //calling the displayDetails method for PetrolEngine class...
        petrol.displayDetails();
        System.out.println("----------------------------------------");

        DieselEngine diesel=new DieselEngine("EN2151522023",true,"2500CC",8000,5,"Diesel");
        //calling the displayDetails method for DieselEngine class...
        diesel.displayDetails();
        System.out.println("----------------------------------------");

        CompressedNaturalGasEngine cng=new CompressedNaturalGasEngine("EN2626262021",false,"3500CC",5200,2,"CNG");
        //calling the displayDetails method for DieselEngine class...
        cng.displayDetails();
        System.out.println("----------------------------------------");

        ElectricEngine electricEngine=new ElectricEngine("EN4565232020",true,"4000CC",3000,3,"Electric",12);
        //calling the displayDetails method for DieselEngine class...
        electricEngine.displayDetails();
    }
}
