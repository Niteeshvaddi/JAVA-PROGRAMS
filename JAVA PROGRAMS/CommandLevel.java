   public class CommandLevel                
   {
       public static void main(String[] args)
       {
           int n = args.length;
           System.out.println("n = " + n);   
       
           for(int i=0;i<n;i++) {
              System.out.println("args[" + i + "] = " + args[i]);
           }
       }            
   }