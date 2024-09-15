public class ArraySum
{
public static void main(String[] args)
{
int[] a = {20,20,30,10,5,5,10};
int sum = 0;
for(int i=0;i<=6;i++)
{
sum = sum + a[i];
System.out.println(a[i]+ " ");
}
System.out.println("sum of all elements: " +sum);
}
}