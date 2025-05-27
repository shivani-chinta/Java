import java.util.*;  
class PriorityQueueDemo//maintains insertion order,duplicates allowed
{  
public static void main(String args[])
{  
PriorityQueue<String> queue=new PriorityQueue<String>();  
queue.add("Aish");  
queue.add("Vaish");  
queue.add("Karthik");  
queue.add("John");  
queue.add("Rishika");
queue.add("Rishika");  
System.out.println("head:"+queue.element());  
System.out.println("head:"+queue.peek());  
System.out.println("iterating the queue elements:");  
Iterator itr=queue.iterator();  
while(itr.hasNext())
{  
System.out.println(itr.next());  
}  
queue.remove();//deletes first element
queue.poll();  //deletes first element
//after deleting it is sorted dont know why
System.out.println("after removing two elements:");  
Iterator<String> itr2=queue.iterator();  
while(itr2.hasNext())
{  
System.out.println(itr2.next());
}
}
}
