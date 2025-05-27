class MultipleCatchDemo1
{
 public static void main(String[] args)
{
 try
 {
 Integer in = new Integer("abc");//it will raise NumberFormatException 
 in.intValue();
 }
 catch (ArithmeticException e)
 {
 System.out.println("Arithmetic " + e);
 }
 catch (NumberFormatException e)
 {
 System.out.println("Number Format Exception " + e);
 } }}