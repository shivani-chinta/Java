//creation of thread using runnable interface
class MultiThreadingDemo1 implements Runnable
{
Thread ob;
MultiThreadingDemo1()
{
ob= new Thread(this);
ob.start();
}
 public  void run()
{
try
{
for(int i=0;i<5;i++)
{
System.out.println("Child"+i);
Thread.sleep(1000);
}
}
catch(Exception e)
{
System.out.println(e);
}
}
 public static void main(String args[])
{
MultiThreadingDemo1 ob1 = new MultiThreadingDemo1();
MultiThreadingDemo1 ob2 = new MultiThreadingDemo1();
try
{
for(int i=0;i<5;i++)
{
System.out.println("Main"+i);
Thread.sleep(1000);
}
}
catch(Exception e)
{
System.out.println(e);
}
}
}
