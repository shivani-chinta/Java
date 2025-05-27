class Parent
{
 void fun()
{
   System.out.println("in parent class fun() method");
}}
class Child extends Parent
{
  void fun()
{
  System.out.println("in child class overridden fun() method");
}}
public class MethodOverridingDemo
{
public static void main(String args[])
{
Child ob=new Child();
ob.fun();//invokes only the child overridden fun() method
}
}