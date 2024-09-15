public class ArmStrong
   {
    public static void main(String[] args)
    {
    int num = 153,temp,rev,sum=0;
    temp = num;
    while(num > 0)
    {
     rev = num%10;
     num = num/10;
     sum = sum + rev*rev*rev;
    }
    if(temp == sum)
    System.out.println("its an armstrong number");
    else
         System.out.println("its not an armstrong     number");
 }
}