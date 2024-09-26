package classes.subclasses;

import classes.superclasses.Vehicle;

public class Car extends Vehicle {
    
    private int doorsQuantity;
    private String fuelType;

    public Car(String brand, String model, int year, int doorsQuantity, String fuelType){
        super(brand, model, year);
        this.doorsQuantity = doorsQuantity;
        this.fuelType = fuelType;
    }

    // Getting class atributtes zone.
    public int getDoorsQuantity(){
        return this.doorsQuantity;
    }

    public String getFuelType(){
        return this.fuelType;
    }
    // End zone.

    // Setting class atributtes zone.
    public void setDoorsQuantity(int doorsQuantity){
        this.doorsQuantity = doorsQuantity;
    }

    public void setFuelType(String fuelType){
        this.fuelType = fuelType;
    }
    // End zone.
}
