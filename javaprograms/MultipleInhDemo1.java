class A
{
  void call1()
{
System.out.println("multiple ");
}
}
interface P
{
  void meth();
}

class C extends A implements P 
{
 public void meth()
{
System.out.println("inheritance");
 }
}
class MultipleInhDemo1
{
 public static void main(String args[])
{
 C ob=new C();
 ob.call1();
  ob.meth();
}}
