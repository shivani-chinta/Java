//thread is a lightweight process,shares memory of parent process,context switching is easy,it is the smallest unit,
//creation of threads using thread class 
class MultiThreadingDemo  extends Thread
{
MultiThreadingDemo()
{
start();
}
public void run()
{
try
{
for(int i=0;i<5;i++)
{
System.out.println("Child"+i);
sleep(1000);
}
}
catch(InterruptedException e)
{
System.out.print("Exception occured "+e);
}
}

public static void main(String args[])
{
MultiThreadingDemo ob =new MultiThreadingDemo();
MultiThreadingDemo ob1 =new MultiThreadingDemo();
for(int i=0;i<5;i++)
{
try{
System.out.println("Main "+i);
sleep(500);
}
catch(InterruptedException e1)
{
System.out.println("Exception occured "+e1);
}
}
}
}
