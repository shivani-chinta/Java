class Student
{
int m1,m2,m3;
Student(int x,int y)
{
m1=x;m2=y;
}
void check(Student s)
{
if((m1==s.m1)&&(m2==s.m2))
System.out.println("both objects are same");
else
System.out.println("not same");
}}
class CallByRefDemo
{
public static void main(String args[])
{
Student s1=new Student(19,21);
Student s2=new Student(14,25);
Student s3=new Student(19,21);
s1.check(s2);
s1.check(s3);
}}
