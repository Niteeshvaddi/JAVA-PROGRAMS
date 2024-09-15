import java.io.*;

public class ExceptionFile
{
  public static void main(String[] args)
{
  try{
 FileReader fr = new FileReader("abc.txt");
 System.out.println("reading from file");
}
catch(Exception e)
{
System.out.println("there");
}
System.out.println("rest of the code");
}
}