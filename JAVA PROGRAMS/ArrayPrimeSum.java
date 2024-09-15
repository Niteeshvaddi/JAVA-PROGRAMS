public class ArrayPrimeSum
{
public static void main(String[] args)
{
int[] a = {20,3,7,11,90,57,36};
int count,sum=0;
for(int i=0;i<a.length;i++)
{
count = 0;
for(int j=1;j<=a[i];j++)
{
if(a[i] % j == 0)
{
count++;
}
}
if(count == 2)
{
System.out.print(a[i]+ " ");
sum = sum + a[i];
}
}
System.out.print(sum);
}
}

