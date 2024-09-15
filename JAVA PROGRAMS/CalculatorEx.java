import java.util.*;
public class CalculatorEx
{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("The Enter 2 numbers");
double a = sc.nextDouble();
double b = sc.nextDouble();
System.out.println("Enter a operator");
char operator = sc.next().charAt(0);
double  result;
switch(operator)
{
case '+':
result = a+b;
System.out.println(a+ " "+operator+ " "+b+ "=" +result);
break;
case '-':
result = a-b;
System.out.println(a+ " "+operator+ " "+b+ "=" +result);
break;
case '*':
result = a*b;
System.out.println(a+ " "+operator+ " "+b+ "=" +result);
break;
case '/':
result = a/b;
System.out.println(a+ " "+operator+ " "+b+ "=" +result);
break;
default:
System.out.println("Error! operator is not correct");
}
}
}

