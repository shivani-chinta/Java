//priority ranges from 1 to 10
class ThreadPriority extends Thread
{
String msg;
ThreadPriority (String s)
{
msg=s;
start();
}
public void run()
{
System.out.println(msg);
try
{
sleep(2000);
}
catch(Exception e)
{}
}
 
public static void main(String args[])
{
ThreadPriority ob=new ThreadPriority ("HI!");
ob.setPriority(MAX_PRIORITY);//value 10
ThreadPriority ob1=new ThreadPriority ("GOOD MORNING!");
ob1.setPriority(NORM_PRIORITY);//value 5 this is also the default priority
ThreadPriority ob2=new ThreadPriority ("BYE!");
ob2.setPriority(MIN_PRIORITY);//value 1
}
}
