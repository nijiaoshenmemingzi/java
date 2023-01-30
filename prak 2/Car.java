/**
 * Car.java
 * [Jelaskan kegunaan class ini]
 * @author 18220014 Pavita Andrea
 */
import  java.lang.String;

public abstract class Car {
    private int numberOfWheels;
    private long mileage;
    
    public Car(int numberOfWheels) {
        // Konstruktor, set mileage = 0
        mileage = 0;
        this.numberOfWheels = numberOfWheels;
    }
    
    public int getNumberOfWheels() {
        // Mengembalikan atribut numberOfWheels 
        return numberOfWheels;
    }
  
    public long getMileage() {
        // Mengembalikan atribut mileage
        return mileage;
    }
    
    public void increaseMileage(long increment) {
        // Meningkatkan nilai atribut mileage
        mileage = mileage + increment;
    }
  
    public String toString() {
        // Mengembalikan informasi mobil dengan format: "Number of Wheels: {numberOfWheels}, Mileage: {mileage}"
        String a;
        a = String.format("Number of Wheels: %d, Mileage: %d", numberOfWheels,mileage);
        return a;
    }
    public abstract long getPrice();
}
  