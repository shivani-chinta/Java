class MultipleCatchDemo2
{
 public static void main(String[] args)
 {
 try
 {
 int a[]=new int[10];
 System.out.println(a[20]);//will raise ArrayIndexOutOfBounds 
 }
 catch(ArrayIndexOutOfBoundsException e)
 {
 System.out.println("ArrayIndexOutOfBounds Exception --> "+e);
 }
 catch(ArithmeticException e)
 {
 System.out.println("Arithmetic Exception --> "+e);
 } } }