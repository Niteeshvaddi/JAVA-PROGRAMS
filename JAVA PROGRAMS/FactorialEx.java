public class FactorialEx
{
public static void main(String[] args)
{
int num = 5,fac = 1,res=0;
for(int i=1;i<=5;i++)
{
res = fac*i;
}
System.out.println("Factorial of" +num+ "is" +res);
}
}