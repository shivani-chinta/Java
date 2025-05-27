class P
{
int a;
P()
{
a=10;
}
void meth(int x)
{
x=x+10;
}
}
class CallByValueDemo
{
public static void main(String args[])
{
P ob=new P();
System.out.println("before="+ob.a);
ob.meth(ob.a);
System.out.println("after="+ob.a);
}}