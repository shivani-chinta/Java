class TestFinallyBlock
{
 public static void main(String args[])
{
 try
{
 int data=25/5;
 System.out.println(data);
 } 
 catch(NullPointerException e)
{
System.out.println(e);
}
finally//is at end of catch block,and is always executed
{
System.out.println("finally block is always executed");
}
 System.out.println("rest of the code...");
 }
}