public class ReverseTotalString
{
 public static void main(String[] args)
{
  String s1 = "Happy Sad Hungry";
  String[] s2 = s1.split(" ");
  String reversedstring = "";
   for(String word : s2) {
   String reversedword = "";
   for(int i = word.length()-1;i>=0;i--)
{
reversedword = reversedword + word.charAt(i);
}
 reversedstring = reversedstring + reversedword + " ";
}
System.out.println(reversedstring);
}
}