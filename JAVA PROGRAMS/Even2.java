public class Even2 {
public static void main(String[] args){
int sum = 0;
System.out.println("the even numbers:");
for(int i=1;i<=20;i++)
{
if(i%2 == 0)
{
System.out.println(i+" ");
sum = sum + i;
}
}
System.out.println("the sum of numbers is: " +sum);
}
}

 
