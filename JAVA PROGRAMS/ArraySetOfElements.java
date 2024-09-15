public class ArraySetOfElements
{
public static void main(String[] args)
{
int[][] a = {{4,5,6},{5,6},{1,1}};
for(int i=0;i<a.length;i++)
{
for(int j=0;j<a[i].length;j++)
{
System.out.print(a[i][j]+" ");
}
System.out.println();
}
}
}