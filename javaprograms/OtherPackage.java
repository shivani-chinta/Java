package p12;
class OtherPackage 
{
OtherPackage()
{
p11.Protection ob=new p11.Protection();
//System.out.println(ob.a);//since a is default variable
//System.out.println(ob.b);//since b is private variable
//System.out.println(ob.c);//since c is protected variable
System.out.println(ob.d);
}}