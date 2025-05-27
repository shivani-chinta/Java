//creation of multiple threads
class ThreadOne extends Thread
{
String cname;int sleeptime;String msg;
ThreadOne( String chname,int time,String msg1)
{
cname=chname;
sleeptime=time;
msg=msg1;
start();
}
public void run() 
{  
 try
{
for(int i=1;i<=5;i++)
{
System.out.println(cname+"is running   :"+msg);
  Thread.sleep(sleeptime);
}
}
catch(InterruptedException e)
{
System.out.println(cname+" interrupted");
}
}
}
class MultipleThreadDemo
{
public static void main(String args[])
{
	new ThreadOne("child1",1000,"Good Morning");
	new ThreadOne("child2",5000,"Hello");
	new ThreadOne("child3",10000,"Welcome");
 try
{
for(int i=1;i<=5;i++)
{
System.out.println("Parent thread"+i);
  Thread.sleep(1000);
}
 }
catch(InterruptedException e)
{
System.out.println("parent thread interrupted");
}
}}
