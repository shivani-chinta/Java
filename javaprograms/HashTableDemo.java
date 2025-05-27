import java.util.*; 
//dictionary is abstract class  that represents key/value storage 
//implements map interface, inherits dictionary class
//each list is known as bucket,contains,unique elements,no null key or values
//is synchronised
class HashTableDemo
{  
 public static void main(String args[])
 {  
  Hashtable<Integer,String> hm=new Hashtable<Integer,String>();  
  hm.put(100,"Amit");  
  hm.put(102,"Ravi");  
  hm.put(101,"Vijay");  
  hm.put(103,"Rahul");  
  for(Map.Entry m:hm.entrySet())
  {  
   System.out.println(m.getKey()+" "+m.getValue());  
  }  
 }  
}  
