import java.util.*;  
class TreeMapDemo//cannout have null key,multiple null values,stored in ascending order of keys
{  
public static void main(String args[])
{  
TreeMap<Integer,String> hm=new TreeMap<Integer,String>();  
hm.put(100,"Amit");  
hm.put(102,"Ravi");  
hm.put(101,"Vijay");  
hm.put(103,"Rahul");  
hm.put(103,"payal");  
hm.put(104,"");
hm.put(105,"");
//hm.put(null,"shanthi");
//hm.put(null,"sree");
for(Map.Entry m:hm.entrySet())
{  
System.out.println(m.getKey()+" "+m.getValue());
}
}
}  
