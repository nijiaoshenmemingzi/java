/**
 * Main.java
 * program utama
 * Pavita Andrea 18220014
 */
import java.lang.System;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String Name = scanner.next();
        Double baseSalary = scanner.nextDouble();
        Double currentPoints = scanner.nextDouble();
        Double targetPoints= scanner.nextDouble();

        Employee a = new Employee(Name , baseSalary);
        EmployeePerformance aperf = new EmployeePerformance(a, currentPoints, targetPoints);
        
        if(aperf.isPromotable()){
            System.out.println("YES");
            System.out.printf("%.2f\n", aperf.getCurrentSalary());
        }
        else{
            System.out.println("NO");
            double h;
            h = 2 * targetPoints - currentPoints;
            System.out.printf("%.2f\n",h);
        }

    }
}
