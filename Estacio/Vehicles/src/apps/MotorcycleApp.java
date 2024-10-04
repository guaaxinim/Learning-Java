import classes.subclasses.Motorcycle;

public class MotorcycleApp {
    
    public static void main(String[] args){
        // Instances zone.
        Motorcycle moto1 = new Motorcycle("Honda", "XR 150 L", 2020, 4, "Normal");
        Motorcycle moto2 = new Motorcycle("Yamaha", "MT 10", 2019, 8, "Deluxe");
        // End zone.
        
        // Getting instances values zone.
        System.out.println("-=-=-=-="+ " MOTORCYCLES "+"-=-=-=-=");
        
        System.out.println("Brand: "+moto1.getBrand());
        System.out.println("Model: "+moto1.getModel());
        System.out.println("Year: "+moto1.getYear());
        System.out.println("Cylinders: "+moto1.getCylinders());
        System.out.println("Handlebar Type: "+moto1.getHandlebarType());
        
        System.out.println("");
        
        System.out.println("Brand: "+moto2.getBrand());
        System.out.println("Model: "+moto2.getModel());
        System.out.println("Year: "+moto2.getYear());
        System.out.println("Cylinders: "+moto2.getCylinders());
        System.out.println("Handlebar Type: "+moto2.getHandlebarType());
        
        System.out.println("");
        // End zone.
        
        // Setting instances values zone.
        moto1.setBrand("BMW");
        moto1.setModel("R 1250 GS Adventure Premium");
        moto1.setYear( 2022);
        moto1.setCylinders(8);
        moto1.setHandlebarType("Deluxe");
        // End zone.
        
        // Getting instances values zone.
        System.out.println("-=-=-=-="+ " MOTORCYCLES "+"-=-=-=-=");
        
        System.out.println("Brand: "+moto1.getBrand());
        System.out.println("Model: "+moto1.getModel());
        System.out.println("Year: "+moto1.getYear());
        System.out.println("Cylinders: "+moto1.getCylinders());
        System.out.println("Handlebar Type: "+moto1.getHandlebarType());
        
        System.out.println("");
        
        System.out.println("Brand: "+moto2.getBrand());
        System.out.println("Model: "+moto2.getModel());
        System.out.println("Year: "+moto2.getYear());
        System.out.println("Cylinders: "+moto2.getCylinders());
        System.out.println("Handlebar Type: "+moto2.getHandlebarType());
        
        System.out.println("");
        // End zone.
    }
}