import java.util.*;

public class PrimeNo102 {
    public static void main(String[] args) {
        int count = 0, temp = 0;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter two numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        for (int i = a; i <= b; i++) {
            count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                temp++;
                if (temp == 102) {
                    System.out.println(i + " is the 102nd prime number.");
                }
            }
        }
    }
}
