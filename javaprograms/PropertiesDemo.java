import java.util.*;
import java.io.*; 
//key/value both are strings
//subclass of Hashtable
//recompilation not required if info changed in properties file coz info is retrieved at run time 
public class PropertiesDemo
{  
 public static void main(String[] args)throws Exception
 {  
  FileReader reader=new FileReader("db.properties");  
  Properties p=new Properties();  
  p.load(reader);  
  System.out.println(p.getProperty("user"));  
  System.out.println(p.getProperty("password"));
 }
} 
