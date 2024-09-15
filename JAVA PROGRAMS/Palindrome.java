public class Palindrome {
public static void main(String[] args)
{
int num = 121,rev=0,temp,n;
temp = num;
while(temp > 0)
{
n = temp % 10;
rev = rev*10+n;
temp = temp / 10;
}
if(num == rev){
System.out.println("the num is palindrome:" +num);
}else {
System.out.println("the num is not palindrome:" +num);
}
}
}