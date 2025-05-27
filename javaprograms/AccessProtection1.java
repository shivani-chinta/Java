package p11;
class AccessProtection1
{
public static void main(String args[])
{
Protection ob1=new Protection();//same class
Derived ob2=new Derived();//childclass of same package 
SamePackage ob3=new SamePackage();//non child class of same package
}}