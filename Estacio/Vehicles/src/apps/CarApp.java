import classes.subclasses.Car;

public class CarApp {
    
    public static void main(String[] args){
        // Instances zone.
        Car car1 = new Car("Toyota", "Corolla", 2023, 4, "Gasoline");
        Car car2 = new Car("Nissan", "Versa", 2022, 4, "Alcohol");
        // End zone.

        // Getting instances values zone.
        System.out.println("-=-=-=-="+" CARS "+"-=-=-=-=");

        System.out.println("Brand: "+car1.getBrand());
        System.out.println("Model: "+car1.getModel());
        System.out.println("Year: "+car1.getYear());
        System.out.println("Doors Quantity: "+car1.getDoorsQuantity());
        System.out.println("Fuel Type: "+car1.getFuelType());
        
        System.out.println("");
        
        System.out.println("Brand: "+car2.getBrand());
        System.out.println("Model: "+car2.getModel());
        System.out.println("Year: "+car2.getYear());
        System.out.println("Doors Quantity: "+car2.getDoorsQuantity());
        System.out.println("Fuel Type: "+car2.getFuelType());
        
        System.out.println("");
        // End zone
        
        // Setting instances values zone.
        car1.setBrand("Chevrolet");
        car1.setModel("Onix");
        car1.setYear(2018);
        car1.setDoorsQuantity(3);
        car1.setFuelType("Alcohol");
        
        car2.setBrand("Volkswagen");
        car2.setModel("Gol");
        car2.setYear(2010);
        car2.setDoorsQuantity(2);
        car2.setFuelType("Gasoline");
        // End zone.
        
        // Getting instances values zone.
        System.out.println("-=-=-=-="+" CARS "+"-=-=-=-=");

        System.out.println("Brand: "+car1.getBrand());
        System.out.println("Model: "+car1.getModel());
        System.out.println("Year: "+car1.getYear());
        System.out.println("Doors Quantity: "+car1.getDoorsQuantity());
        System.out.println("Fuel Type: "+car1.getFuelType());
        
        System.out.println("");
        
        System.out.println("Brand: "+car2.getBrand());
        System.out.println("Model: "+car2.getModel());
        System.out.println("Year: "+car2.getYear());
        System.out.println("Doors Quantity: "+car2.getDoorsQuantity());
        System.out.println("Fuel Type: "+car2.getFuelType());
        
        System.out.println("");
        // End zone
    }

}