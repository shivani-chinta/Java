import java.io.*;
class DirList
{	
 public static void main(String args[])
 {	
  String dname="D:/javaprograms";
  File myDir=new File(dname);
  if(myDir.isDirectory())
   {	
    File arr[]=myDir.listFiles();
    RecursivePrint(arr);  
   }
 }
static void RecursivePrint(File[] arr)  
{ 	
 for (File f : arr)  
 { 	
  if(f.isFile())  
  System.out.println(f.getName()+" is a file"); 
  else if(f.isDirectory())  
  {  	
   System.out.println(f.getName()+" is a directory"); 
   RecursivePrint(f.listFiles()); 
  }	 
 }
}
}
