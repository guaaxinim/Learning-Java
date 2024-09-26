package classes.superclasses;

public class Vehicle {
    
    private String brand;
    private String model;
    private int year;

    public Vehicle(String brand, String model, int year){
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // Getting class atributtes zone.
    public String getBrand(){
        return this.brand;
    }

    public String getModel(){
        return this.model;
    }

    public int getYear(){
        return this.year;
    }
    // End zone.

    // Setting class atributtes zone.
    public void setBrand(String brand){
        this.brand = brand;
    }

    public void setModel(String model){
        this.model = model;
    }

    public void setYear(int year){
        this.year = year;
    }
    // End zone.
}
