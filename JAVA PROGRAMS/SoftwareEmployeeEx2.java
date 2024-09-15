import java.util.*;

public class SoftwareEmployeeEx2 {
    public static void main(String[] args) {
        double sal, tax = 0;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the employee salary");
        sal = sc.nextDouble();
        
        if (sal > 20000) {
            System.out.println("No tax");
        } else if (sal > 20000 && sal <= 40000) {
            tax = sal * 0.15; // Calculate 15% tax
        } else if (sal > 40000 && sal <= 60000) {
            tax = sal * 0.25; // Calculate 25% tax
        } else if (sal > 80000 && sal <= 90000) {
            tax = sal * 0.45; // Calculate 45% tax
        }
        
        double netSalary = sal - tax; // Calculate net salary
        
        System.out.println("Tax amount: " + tax);
        System.out.println("Net salary after tax: " + netSalary);
        
        sc.close(); // Close the Scanner object
    }
}
