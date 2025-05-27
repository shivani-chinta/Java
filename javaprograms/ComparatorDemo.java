import java.util.*;  
import java.io.*;  
class ComparatorDemo
{  
public static void main(String args[])
{  
  ArrayList<StudentComparator> al=new ArrayList<StudentComparator>();  
  al.add(new StudentComparator(101,"Vijay",23));  
  al.add(new StudentComparator(106,"Ajay",27));  
  al.add(new StudentComparator(105,"Jai",21));  
  System.out.println("Sorting by Name...");  
  Collections.sort(al,new NameComparator());  
  for(StudentComparator st: al)
   {  
    System.out.println(st.rollno+" "+st.name+" "+st.age);  
   }  
  System.out.println("sorting by age...");  
  Collections.sort(al,new AgeComparator());  
  for(StudentComparator st: al)
   {  
    System.out.println(st.rollno+" "+st.name+" "+st.age);  
   }
}
}  
