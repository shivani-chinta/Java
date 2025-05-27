class A
{
   void meth(int a)
   {System.out.println(+a);}
}
class B extends A
 {
  void meth(int a,int b)
  { System.out.println(+a+" "+b);}
 }
public class MethOverloadingInhertDemo
{
public static void main(String args[ ])
{ B ob=new B();
  ob.meth(10);
 ob.meth(20,30);
}
}