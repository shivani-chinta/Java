import java.util.*;  
class LinkedHashMapDemo//one null key,maintains insertion order,many null values
{  
 public static void main(String args[])
{  
 LinkedHashMap<Integer,String> hm=new LinkedHashMap<Integer,String>();  
  hm.put(104,"Amit");  
  hm.put(102,"Vijay");  
  hm.put(100,"Rahul"); 
  hm.put(103,"sree");  
  hm.put(104,"");
  hm.put(105,"");
  hm.put(null,"shanthi");
  hm.put(null,"sree");
  for(Map.Entry m:hm.entrySet())
   {  
   System.out.println(m.getKey()+" "+m.getValue());
    }
  }
}  
