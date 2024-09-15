class Animal
{
  public void cat()
{
System.out.println("miyaoo");
}
}
class Animal2 extends Animal
{
public void rat()
{
System.out.println("chezz");
}
}
public class SingleInheritance2
{
public static void main(String[] args)
{
Animal2 an = new Animal2();
an.cat();
an.rat();
}
}