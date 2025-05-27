class  A	 
{ 
  A() 
{ System.out.println("in A");}} 
class B extends A 
{ 
  B() 
{   
System.out.println("in child class B");}} 
class C extends B 
{ 
  C() 
{  
System.out.println("in grand child C");}} 
class ConstructorCallingDemo 
{ 
public static void main(String args[]) 
{ 
 C ob=new C(); 
}} 