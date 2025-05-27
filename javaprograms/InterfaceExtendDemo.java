interface A
{
 void call1();
}
interface B extends A
{
 void call2();
}
class C implements B
{
 public void call1()
{
 System.out.println("from A");
}
 public void call2()
{
 System.out.println("from B");
}
}
class InterfaceExtendDemo
{
public static void main(String args[])
{
 C ob=new C();
 ob.call1();
 ob.call2();
}}