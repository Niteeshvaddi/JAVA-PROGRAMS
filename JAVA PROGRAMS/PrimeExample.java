public class PrimeExample
{
 public static void main(String[] args)
{
  System.out.println("the numbers are prime");
  for(int i = 111; i<= 999; i++)
{
 int count = 0;
 for(int j = 1; j<=i;j++)
{
if( i % j == 0)
{
  count++;
}
}
if(count == 2)
{
System.out.print(" "+i);
}
}
}
}

