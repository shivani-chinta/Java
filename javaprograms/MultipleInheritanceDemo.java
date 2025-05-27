interface A
{
 void meth1();
}
interface B
{
 void meth2();
}
class C implements A,B
{
public void meth1()
{
 System.out.println("good");
}
public void meth2()
{
System.out.println("afternoon");
}
}
class MultipleInheritanceDemo
{
public static void main(String args[])
{C ob=new C();
ob.meth1();
ob.meth2();
}}