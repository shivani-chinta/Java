interface A
{
  void call1();
  void call2();
  void call3();
}
 abstract class B implements A
{
  public void call1()
{
  System.out.println("last day of the month");
}}
class C extends B
{
 public void call2()
{
System.out.println("April");
}
public void call3()
{
System.out.println("2021");
}
}
class PartialImpInterface
{
 public static void main(String args[])
{
C ob=new C();
ob.call1();
ob.call2();
ob.call3();
}}
