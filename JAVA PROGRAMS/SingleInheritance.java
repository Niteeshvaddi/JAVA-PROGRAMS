class people
{
int mem = 45;
}
class bus extends people
{
int memout = 55;
}
public class SingleInheritance
{
public static void main(String[] args)
{
bus sr = new bus();
System.out.println("total bal =" +(sr.mem+sr.memout));
}
}
