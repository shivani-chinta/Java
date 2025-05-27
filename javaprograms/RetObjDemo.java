class Q
{
int x;
Q(int l)
{x=l;}
Q meth()
{
Q ob=new Q(25);
return ob;
}
}
class RetObjDemo
{public static void main(String args[])
{Q ob1=new Q(10);
System.out.println("before="+ob1.x);
ob1=ob1.meth();
System.out.println("after="+ob1.x);
}}

