interface A
{
//All variables declared inside interface are implicitly public,static and final.
 int YES=1;
 int NO=0;
}
class B implements A
{
 int check(int m)
 {
 if (m<18)
 return NO;
 else
 return YES;
 }
}
class C implements A
{
 void verify(int r)
 {
  switch(r)
  {
  case YES: System.out.println("Eligible");break;
  case NO: System.out.println("Not Eligible");break;
}}}
class InterfaceVarDemo
{
 public static void main(String args[])
{
 B ob1=new B();
 C ob2=new C();
 ob2.verify(ob1.check(15));
 ob2.verify(ob1.check(35));
}}