interface A
{
//All variables declared inside interface are implicitly public,static and final.
 int var=25;
//All methods declared inside interfaces are implicitly public and abstract, even if you don't use public or abstract keyword.
 void call();
}
class B implements A
{ public void call()
{
 System.out.println("last day of the month");
}}
class InterfaceDemo1
{
 public static void main(String args[])
{
B ob=new B();
ob.call();
}}