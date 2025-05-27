import java.util.*;  
public class HashSetDemo//unique elements,ascending order storage
{  
public static void main(String args[])
{  
//Creating HashSet and adding elements  
HashSet<String> set=new HashSet<String>();  
set.add("AISH");  
set.add("SHIVANI");  
set.add("AISH");  
set.add("RISHIKA");  
//Traversing elements  
Iterator<String> itr=set.iterator();  
while(itr.hasNext())
{  
System.out.println(itr.next());
}
}
}
