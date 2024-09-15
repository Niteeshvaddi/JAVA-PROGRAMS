import java.util.*;

public class StudentGrade
{
public static void main(String[] args)
{
double s1,s2,s3,s4,s5,total,avg;
Scanner sc = new Scanner(System.in);
System.out.println("Enter marks for the 5 subjects");
s1=sc.nextInt();
s2=sc.nextInt();
s3=sc.nextInt();
s4=sc.nextInt();
s5=sc.nextInt();
total = s1+s2+s3+s4+s5;
System.out.println("the total marks is:" +total);
avg = total/5;
System.out.println("the total avg marks is:" +avg);
if(avg >= 90 && avg <= 100)
{
System.out.println("Grade O");
}
else if(avg >= 80 && avg <= 90)
{
System.out.println("Grade A");
}
else if(avg >= 70 && avg <= 80)
{
System.out.println("Grade B");
}
else if(avg >= 60 && avg <= 70)
{
System.out.println("Grade C");
}
else if(avg >= 50 && avg <= 60)
{
System.out.println("Grade D");
}
else if(avg >= 40 && avg <= 50)
{
System.out.println("Grade E");
}
else{
System.out.println("FAIL");
}
}
}

