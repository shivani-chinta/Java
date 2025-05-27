class NestedTryDemo1
{
 public static void main(String args[])
{
 try
 {
 int a=args.length;
 int b=5/a;//if a is 0 it will throw ArithmeticException 
 try
 {
 int c=45/(a-1);//if (a-1) is 0 it will throw ArithmeticException 
 int p[]=new int[-5];// will throw NegativeArraySizeException 
 }
 catch(NegativeArraySizeException e)
 {
 System.out.println("negative array size exception in nested catch");
 }
 }//closing of outer try
 catch(ArithmeticException e)
{
 System.out.println("Arithmetic exception caught in outer catch");
}
}}