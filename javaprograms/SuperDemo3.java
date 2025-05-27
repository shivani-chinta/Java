class Box 
{ 
private double width,height,depth; 
Box() 
{  width=10;height=10;depth=10;} 
Box(double w,double h,double d) 
{    width=w;height=h;depth=d;    } 
void volume() 
{ System.out.println(width*height*depth);} 
} 
class Boxw extends Box 
{ 
   double weight; 
   Boxw() 
{ 
   super(); 
   weight=10;} 
Boxw(double w,double h,double d,double wt) 
{ 
 //width=w;height=h;depth=d;  // private data access in childclass will give error 
super(w,h,d); 
  weight=wt;  } 
void displayweight() 
{ 
 System.out.println(weight); } 
} 
class SuperDemo3 
{ 
 public static void main(String args[]) 
{ 
  Boxw ob1=new Boxw(); 
  ob1.volume(); 
ob1.displayweight(); 
Boxw ob2=new Boxw(1,2,3,4); 
  ob2.volume(); 
  ob2.displayweight();}} 