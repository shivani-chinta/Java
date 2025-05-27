class A
{
  int a;
  A()
{
  a=10;
}
void cbr(A obj)
{
  obj.a=obj.a+10;
}
}
class CBR
{
  public static void main (String args[])
{
  A ob=new A();
System.out.println("before="+ob.a);
  ob.cbr(ob);
System.out.println("after="+ob.a);
}}
