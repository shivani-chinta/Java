import java.util.*; 
import java.io.*; 
public class Hashtbl
 { 
  public static void main(String[] args)
  {  
   try
    {
	FileInputStream fs = new FileInputStream("D:/javaprograms/ph.txt"); 
	Scanner sc = new Scanner(fs).useDelimiter("\\s+"); 
	Hashtable<String, String> ht = new Hashtable<String, String>(); 
	String[] str; 
	String a;  
	System.out.println("HASH TABLE IS");  
	System.out.println("--------------------------");
	System.out.println("KEY : VALUE"); 
	while (sc.hasNext())
 	 {
	   a = sc.nextLine(); 
	   str = a.split("\\s+");
	   ht.put(str[0], str[1]); 
	   System.out.println(str[0] + ":" + str[1]);  
          } 
 	System.out.println("------MENU------"); 
	System.out.println("----1.Search by Name------"); 
	System.out.println("----2.Search by Mobile------");
	System.out.println("----3.Exit------");  
	String opt = "";  String name, mobile; 
	Scanner s = new Scanner(System.in); 
	while (opt != "3") 
	{
	  System.out.println("Enter Your Option 1,2,3"); 
	  opt = s.next();  
	  switch (opt)
	    { 
	      case "1": { System.out.println("Enter Name"); 
 			  name = s.next(); 
 			  if (ht.containsKey(name)) 
				{  System.out.println("Mobile is " + ht.get(name));  }
 			  else { System.out.println("Not Found"); }
			} 
 			break; 
	      case "2":{  System.out.println("Enter mobile");  
			  mobile = s.next();  
			  if (ht.containsValue(mobile))
				 {  
				  for (Map.Entry e : ht.entrySet()) 
				   { 
				    if (mobile.equals(e.getValue()))
				     {System.out.println("Name is " + e.getKey());}
                                    }
                                  }
 			  else {  System.out.println("Not Found");  }
			}  
			break;  
	 	case "3":{  opt = "3";   
			    System.out.println("Menu Successfully Exited"); 
			 }
  			 break; 
 		default:  System.out.println("Choose Option between One and Three");  
			 break;
	      }  
	}
    }
   catch (Exception ex) {  System.out.println(ex.getMessage());  }
  }
 }