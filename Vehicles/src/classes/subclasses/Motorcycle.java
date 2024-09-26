package classes.subclasses;

import classes.superclasses.Vehicle;

public class Motorcycle extends Vehicle{

    private int cylinders;
    private String handlebarType;

    public Motorcycle(String brand, String model, int year, int cylinders, String handlebarType){
        super(brand, model, year);
        this.cylinders = cylinders;
        this.handlebarType = handlebarType;
    }

    // Getting class atributtes zone.
    public int getCylinders(){
        return this.cylinders;
    }

    public String getHandlebarType(){
        return this.handlebarType;
    }
    // End zone.

    // Setting class atributtes zone.
    public void setCylinders(int cylinders){
        this.cylinders = cylinders;
    }

    public void setHandlebarType(String handlebarType){
        this.handlebarType = handlebarType;
    }
    // End zone.
}