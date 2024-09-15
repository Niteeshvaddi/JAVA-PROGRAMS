class A1
{
void name1()
{
System.out.println("Balu");
}
}
class A2 extends A1
{
void name2()
{
System.out.println("Niteesh");
}
}
class A3 extends A1
{
void name3()
{
System.out.println("vaddi");
}
}
public class HeirarichalEx
{
public static void main(String[] args)
{
A3 obj = new A3();
obj.name1();
obj.name3();
}
}
