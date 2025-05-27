import java.util.*;  
class ArrayListDemo//array list maintains insertion order,allows duplicates,nonsychronised
{  
public static void main(String args[])
{  
ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
list.add("SHIVANI");//Adding object in arraylist  
list.add("RISHIKA");  
list.add("AISH");  
list.add("RISHIKA");  
//Traversing list through Iterator  
Iterator itr=list.iterator();  
while(itr.hasNext())
{  
System.out.println(itr.next()); 
}
}
}  
