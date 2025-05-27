class ThrowExample
{
 static void avg()
 {
 try//doubtful code is put in try block
 {
 throw new ArithmeticException("demo");//The throw keyword is used to throw an exception explicitly
 }
 catch(ArithmeticException e)//catch catches the exception to handle it 
 {
 System.out.println("Exception caught");
 }
 }
 public static void main(String args[])
 {
 avg();
}}