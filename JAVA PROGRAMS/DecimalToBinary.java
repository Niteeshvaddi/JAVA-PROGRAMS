import java.util.*;
public class DecimalToBinary
{
public static void main(String[] args)
{
int b[] = new int[100];
Scanner sc = new Scanner(System.in);
System.out.println("Enter a number");
int num = sc.nextInt();
int i = 0;
while(num != 0)
{
  b[i] = num%2;
  num  = num/2;
  i++;
}
System.out.println("the binary number is :" );
for(int j=i-1;j>=0;j--)
{
System.out.println(b[j]);
}
}
}
