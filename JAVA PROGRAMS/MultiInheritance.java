class animal
{
 public void eat()
{
System.out.println("eating....");
}
}
class dog extends animal
{
public void sleep()
{
System.out.println("sleeping....");
}
}
class bird extends dog
{
public void fly()
{
System.out.println("flying....");
}
}
public class MultiInheritance
{
public static void main(String[] args)
{
bird br = new bird();
br.eat();
br.sleep();
br.fly();
}
}

