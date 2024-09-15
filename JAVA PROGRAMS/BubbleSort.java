public class BubbleSort
{
public static void main(String[] args)
{
int[] a = {50,23,45,55,67,35};
int temp;
for(int i=0;i<a.length-i;i++)
{
for(int j=0;j<a.length-1-i;j++)
{
if(a[j]>a[j+1])
{
temp = a[j];
a[j] = a[j+1];
a[j+1] = temp;
}
}
}
for(int i=0;i<a.length;i++)
{
System.out.print(a[i]+" ");
}
}
}