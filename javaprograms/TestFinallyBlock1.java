class TestFinallyBlock1
{
 public static void main(String args[])
{
 try
{
 int data=25/0;//raises ArithematicException
 System.out.println(data);
 }
 catch(ArithmeticException e)
{
System.out.println(e);
}
finally
{
System.out.println("finally block is always executed");
}
System.out.println("rest of the code...");
} } 