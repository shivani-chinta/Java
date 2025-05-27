class Student
{  
 int rollno;  
 String name;  
 static String college = "MGIT";  
 //static method to change the value of static variable  
 static void change()
 {  
  college = "CBIT"; 
  //rollno=525; //non-static variable cannot be accessed from static method
  }    
 Student(int r, String n)
 {  
  rollno = r;  
  name = n;
 }      
  void display()
  {
   System.out.println(rollno+" "+name+" "+college);
  }  
}  
class TestStaticMethod
{  
public static void main(String args[])
{  
 Student s1 = new Student(111,"sree"); 
 s1.display(); 
 Student.change();//static methods can be called using class name
 //static methods can be called without objects
 //change();cannot use this becoz it is not a method of same(student) class
 Student s2 = new Student(222,"Aadi");    
 s2.display();  
}}  
