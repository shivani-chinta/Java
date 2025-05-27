class A
{
int a;
}
class AliasDemo
{public static void main(String args[])
{
A ob1=new A();
A ob2=ob1;
ob1.a=25;
System.out.println(ob2.a);
}}

