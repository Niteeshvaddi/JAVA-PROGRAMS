import java.util.*;

public class AsciiValue 
 {
  public static void main(String[] args)
  {
  char ch;
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter a character");
  ch = sc.next().charAt(0);
  int Asciivalue = ch;
  System.out.println("Asciivalue of a char is:" +Asciivalue);
}
}

