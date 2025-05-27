import java.util.*;  
public class TreeSetDemo//unique elements,access and retrieval time is fast,ascending order storage
{  
public static void main(String args[])
{  
//Creating and adding elements  
TreeSet<String> set=new TreeSet<String>();  
set.add("AISH");  
set.add("RISHIKA");  
set.add("AISH");  
set.add("SHIVANI");  
//traversing elements  
Iterator<String> itr=set.iterator();  
while(itr.hasNext())
{  
System.out.println(itr.next());
}
}
}
