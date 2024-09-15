import java.util.*;

public class QuardaticEqu
{
public static void main(String[] args)
{
double a,b,c,d,root1,root2;
Scanner sc = new Scanner(System.in);
System.out.println("Enter a,b values=");
a = sc.nextDouble();
d = sc.nextDouble();
c = sc.nextDouble();
d = b*b-(4*a*c);
if(d == 0)
{
System.out.println("roots are real and equal");
root1 = -b/(2*a);
root2 = -b/(2*a);
System.out.println("roots1 =" +root1);
System.out.println("roots2 =" +root2);
}
else if(d > 0)
{
System.out.println("roots are real and not equal");
root1 = -b+math.sqrt(d)/(2*a);
root2 = -b-math.sqrt(d)/(2*a);
System.out.println("roots1 =" +root1);
System.out.println("roots2 =" +root2);
}else
System.out.println("roots are imaginary");
}
}
