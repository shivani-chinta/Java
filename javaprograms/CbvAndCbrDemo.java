class P
{int a;
void cbv(int x)
{x=50;}
void cbr(P ob)
{ob.a=100;}
}
class CbvAndCbrDemo
{
public static void main(String args[])
{P ob1=new P();
ob1.a=25;
System.out.println("Before "+ob1.a);
ob1.cbv(ob1.a);
System.out.println("After cbv "+ob1.a);
System.out.println("Before "+ob1.a);
ob1.cbr(ob1);
System.out.println("After cbr "+ob1.a);
}}