import java.util.*;  
class MapInterfaceExample//allow one null keys and many null values,insertion is ascending order of keys
{  
 public static void main(String args[])
 {  
  Map<Integer,String> map=new HashMap<Integer,String>();  
  map.put(100,"Amit");  
  map.put(102,"Vijay");  
  map.put(101,"Rahul");
  map.put(103,"Amit");
  map.put(null,"Aish");
  map.put(104,"");  
  map.put(105,"");
  map.put(null,"Rishika");
  for(Map.Entry m:map.entrySet())
  {  
   System.out.println(m.getKey()+" "+m.getValue());
   }
  }
}  
