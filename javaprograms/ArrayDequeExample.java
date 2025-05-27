import java.util.*;  
public class ArrayDequeExample//add or remove from  both ends,null ele not allowed,not thread safe,no capacity restrictions,faster than ll&stack
{ //maintains insertion order,duplicates allowed
   public static void main(String[] args)
   {  
   //Creating Deque and adding elements  
   Deque<String> deque = new ArrayDeque<String>();  
   deque.add("RISHIKA");    
   deque.add("VAISH");     
   deque.add("AISH"); 
   deque.add("AISH");  
   //Traversing elements  
   for (String str : deque)
    {  
     System.out.println(str);
    }
   }
}
