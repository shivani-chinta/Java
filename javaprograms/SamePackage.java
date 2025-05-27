package p11;
class SamePackage
{
SamePackage()
{
Protection ob=new Protection();
System.out.println(ob.a);
//System.out.println(ob.b);//since b is private varible
System.out.println(ob.c);
System.out.println(ob.d);
}}