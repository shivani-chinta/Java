class A 
{    
final  void meth(){} 
} 
class B extends A 
{ 
  //void meth(){}//final methods cannot be ovverriden 
} 
class FinalDemo2 
{ 
  public static void main(String args[]) 
{ 
 B ob=new B(); 
   ob.meth(); 
}} 