public class Stringrevwithoutmethod
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter a characther");
String input = sc.next();
int len = input.length();
for(int i=len-1;i>=0;i--)
{
System.out.println(input.charAt(i));
}
}
}
