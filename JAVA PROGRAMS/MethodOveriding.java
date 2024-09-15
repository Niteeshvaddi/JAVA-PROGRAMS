class Test
{
void Exam()
{
System.out.println("maths");
}
}
class Test2 extends Test
{
void Exam()
{
super.Exam();
System.out.println("english");
}
}
public class MethodOveriding
{
public static void main(String[] args)
{
Test2 t = new Test2();
t.Exam();
}
}