public class Array2dsum
{
public static void main(String[] args)
{
int[][] a = {{10,10,5},{5,10,10}};
int sum = 0;
for(int i=0;i<a.length;i++)
{
for(int j=0;j<3;j++)
{
sum = sum + a[i][j];
System.out.print(a[i][j] + " ");
}
System.out.println("sum of elements:" +sum);
}
}
}