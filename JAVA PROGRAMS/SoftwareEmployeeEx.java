import java.util.*;

public class SoftwareEmployeeEx 
{
 public static void main(String[] args)
{
double sal,tax=0;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the employee salary");
sal = sc.nextDouble();
if(sal < 20000)
{
System.out.println("No tax");
}
else if(sal > 20000 && sal <= 40000){
tax = tax*0.15;
System.out.println("tax amount" +tax);
sal = sal - tax;
System.out.println("sal amount" +sal);
}
else
if(sal > 40000 && sal <= 60000)
{
tax = tax*0.25;
System.out.println("tax amount" +tax);
sal = sal - tax;
System.out.println("sal amount" +sal);
} else
if(sal > 80000 && sal <= 90000)
{
tax = tax*0.45;
System.out.println("tax amount" +tax);
sal = sal - tax;
System.out.println("sal amount" +sal);
}
}
}
