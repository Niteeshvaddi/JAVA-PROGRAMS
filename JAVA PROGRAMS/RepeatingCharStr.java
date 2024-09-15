import java.util.*;
public class RepeatingCharStr
{
 public static void main(String[] args)
{
int count = 0;
Scanner sc = new Scanner(System.in);
System.out.println("enter a string");
String str = sc.next();
System.out.println("enter a character");
char ch = sc.next().charAt(0);
int n = str.length();
for(int i=0;i<n;i++)
{
if(ch == str.charAt(i))
{
count++;
}
}
System.out.println(count);
}
}
