import java.util.Scanner;

public class StringCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.next();
        int count = 0;


        for (int i = 0; i < input.length(); i++) {
  
            count++;
        }
        System.out.println("Total characters in the string: " + count);
    }
}
