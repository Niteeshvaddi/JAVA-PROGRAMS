import java.util.*;

public class ReverseNo 
{
public static void main(String[] args)
{
int num,rev=0,r;
Scanner sc = new Scanner(System.in);
System.out.println("Enter a number");
num = sc.nextInt();
while(num > 0)
{
 r = num % 10;
 rev = rev * 10+r;
 num = num / 10;
}
System.out.println("Reverse of a number:" +rev);
}
}