class Student
{
int rollno;
String name;
static String college="MGIT";//static variable
Student(int r,String n)
{
rollno=r;
name=n;
}
void display()
{
System.out.println(rollno+" "+name+" "+college);
}}
class TestStaticVariable1
{
public static void main(String args[])
{
Student s1=new Student(111,"sree");
Student s2=new Student(222,"Adi");
 //we can change the college of all objects by the single line of code  
 //Student.college="CBIT";  //static variables are accessed using classname outside the class
s1.display();
s2.display();
}}