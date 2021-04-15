package chapter8.vehicles;

import chapter8.MyScanner;

public class Run implements MyScanner {

    public static void main(String[] args) {
        AnotherVehicle minivan = new AnotherVehicle();
        AnotherVehicle suv = new AnotherVehicle();

        getSpecification(minivan);
        getSpecification(suv);

        System.out.println(minivan.toString());
        System.out.println(suv.toString());
    }

    static void getSpecification(AnotherVehicle auto){
        System.out.println("Enter a producer:");
        auto.setProducer(input.nextLine());
        System.out.println("Enter a model:");
        auto.setModel(input.nextLine());
        System.out.println("Enter count of passengers:");
        auto.setPassengers(Integer.parseInt(input.nextLine()));
        System.out.println("Enter fuel capacity:");
        auto.setFuelCapacity(Integer.parseInt(input.nextLine()));
        System.out.println("Enter kilometers per liter:");
        auto.setKilometersPerLiter(Double.parseDouble(input.nextLine()));
    }

}



//Test

//Ford
//Galaxy
//7
//60
//5.8

//Volkswagen
//Atlas
//5
//70
//6.4