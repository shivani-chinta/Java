import java.util.StringTokenizer;  
//default delimiter is space,delimiter is char which tells where the token is to be cut in a string
public class StringTokenizerDemo
{  
 public static void main(String args[])
 {  
   StringTokenizer st = new StringTokenizer("we are students of cse");  
   while (st.hasMoreTokens()) 
   {  
    System.out.println(st.nextToken());  
   }  
 }  
}  
