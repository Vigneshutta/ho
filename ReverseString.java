import java.util.*;
import java.io.*;
public class ReverseString
{
      public static void main(String[] args)throws IOException
      {
        BufferedReader vc=new BufferedReader(new InputStreamReader(System.in));
         String input="";
        String s;
        System.out.println("Enter the string");
        s=vc.readLine();
        String reverse = new StringBuffer(s).reverse().toString();
      System.out.println("\nString before reverse: "+s);
      System.out.println("String after reverse: "+reverse);    
        }
        }
  
