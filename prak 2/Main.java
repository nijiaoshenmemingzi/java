/**
 * Main.java
 * membuat main program
 * @author 18220014 Pavita Andrea
 */
import java.lang.System;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int jenis = scanner.nextInt();
        if (jenis == 1) {
            int maxCapacity = scanner.nextInt();
            Bus bus = new Bus(maxCapacity);
            int jarak = scanner.nextInt();
            System.out.println(bus.toString());
            System.out.println(bus.getPrice());
            bus.increaseMileage(jarak);
            System.out.println(bus.toString());
            System.out.println(bus.getPrice());
        } else if (jenis == 2) {
            int numberOfWheels = scanner.nextInt();
            boolean loaded = scanner.nextBoolean();
            Truck truck = new Truck(numberOfWheels, loaded);
            int jarak = scanner.nextInt();
            System.out.println(truck.toString());
            System.out.println(truck.getPrice());
            truck.increaseMileage(jarak);
            System.out.println(truck.toString());
            System.out.println(truck.getPrice());
        } else {
            long basePrice = scanner.nextLong();
            Van van = new Van(basePrice);
            int jarak = scanner.nextInt();
            System.out.println(van.toString());
            System.out.println(van.getPrice());
            van.increaseMileage(jarak);
            System.out.println(van.toString());
            System.out.println(van.getPrice());
        }
    }
}