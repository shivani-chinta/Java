//implementing using runnable interface
import java.util.*;
class Number extends Thread 
{
public Random r;
public Thread t1, t2;
public void run()
{
int num = 0;
r = new Random();
try
{
for (int i = 0; i < 5; i++)
{
num = r.nextInt(100);
System.out.println("Main Thread:Generated Number is " + num);
if (num % 2 == 0)
{
t1 = new Thread(new even(num));
t1.start();
}
else 
{
t2 = new Thread(new odd(num));
t2.start();
}
Thread.sleep(1000);
System.out.println("--------------------------------------");
}
}
catch (Exception ex)
{
System.out.println(ex.getMessage());
}
}
}

class even implements Runnable
{
public int x;
public even(int x)
{
this.x = x;
}
public void run()
{
System.out.println("Even Thread:" + x + "is even Number and Square of " + x+ " is: " +( x * x));
}
}

class odd implements Runnable
{
public int x;
public odd(int x)
{
this.x = x;
}
public void run()
{
System.out.println("Odd Thread:" + x + " is odd number and Cube of " + x +" is: " + (x * x * x));
}
}

public class RandomCubeSquare
{
public static void main(String[] args)
{
Number n = new Number();
n.start();
}
}