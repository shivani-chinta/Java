import java.util.*;
class MyException extends Exception
{
 MyException()
{
 System.out.println("PASSWORD should be 8 characters long");
}
}
class UserDefinedExceptionDemo
{
 static void check(int n)
{
 try
{
 if(n<8)
 throw new MyException();//explicitly throwing obj of MyException class 
else
 System.out.println("no problem continue");
 }
catch(MyException e)
{
 System.out.println("user exception caught");
}
}
public static void main(String args[])
{
 Scanner s=new Scanner(System.in);
 System.out.println("Enter your password");
 check(s.nextLine().length()); 
 System.out.println("Enter your password");
 check(s.nextLine().length());
 }}