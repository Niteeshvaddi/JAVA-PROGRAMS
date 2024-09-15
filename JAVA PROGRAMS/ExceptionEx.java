public class ExceptionEx
{
public static void main(String[] args)
{
methodone();
}
public static void methodone()
{
methodtwo();
}
public static void methodtwo()
{
try{
int a = 10/0;
}
catch(Exception e)
{
System.out.println("clear");
}
System.out.println("hello");
}
}