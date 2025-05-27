class NestedTryDemo2
{
static void meth(int a)
{
try
 {
 int c=45/(a-1);// if (a-1) is 0 it will throw ArithmeticException 
 int p[]=new int[-5];//will throw NegativeArraySizeException 
 }
 catch(NegativeArraySizeException e)
 {
 System.out.println("negative array size exception in nested catch");
 }
}
 public static void main(String args[])
{
int a=args.length;
 try{
 int b=5/a;//if a is 0 it will throw ArithmeticException
 meth(a);
 } //closing of outer try
 catch(ArithmeticException e)
{
 System.out.println("Arithmetic exception caught in outer catch");
}
}}
