import java.util.*;  
public class LLDemo//is double linked list,nonsynchronised,allows duplicates,maintains insertion order
{  
public static void main(String args[])
{  
LinkedList<String> al=new LinkedList<String>();  
al.add("MGIT");  
al.add("CSE");  
al.addFirst("IT");  
al.add("CSE");  
Iterator<String> itr=al.iterator();  
while(itr.hasNext())
{  
System.out.println(itr.next());
}
}
} 
