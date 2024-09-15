import java.util.*;

public class SalaryTax
{
public static void main(String[] args)
{
double sal,tax;
System.out.println("Enter salary");
Scanner sc = new Scanner(System.in);
sal = sc.nextDouble();
if(sal > 20000)
{
tax = sal*17/100;
System.out.println("tax amount = " +tax);
sal = sal - tax;
System.out.println("salary amount = " +tax);
}else {
System.out.println("No Tax");
}
}
}
