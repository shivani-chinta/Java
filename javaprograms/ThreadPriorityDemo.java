class Threadone extends Thread
{
public void run() 
{
  try
{
 for(int i=1;i<5;i++)
{
  System.out.println("child1: "+i);
  Thread.sleep(1000);  }}
 catch(InterruptedException e)
{
System.out.println("child one interrupted");
}}}
class Threadtwo extends Thread
{
public void run() 
{  try
{ for(int i=1;i<5;i++)
{  System.out.println("child2: "+i);
  Thread.sleep(1000);
}}
 catch(InterruptedException e)
{System.out.println("child two interrupted");
}}}
class Threadthree extends Thread
{public void run() 
{  try
{ for(int i=1;i<5;i++)
{  System.out.println("child3: "+i);
  Thread.sleep(1000);}}
 catch(InterruptedException e)
{System.out.println("child three interrupted");
}}}
class ThreadPriorityDemo
{ public static void main(String args[])
{
Threadone a=new Threadone();
a.setPriority(Thread.MIN_PRIORITY);
System.out.println(a.getPriority());
a.start();
 Threadtwo b=new Threadtwo();
b.setPriority(7);
b.start();
  Threadthree c=new Threadthree();
c.setPriority((Thread.MAX_PRIORITY));
c.start();
try{
Thread.sleep(5000);
}
catch(InterruptedException e)
{ System.out.println("main interrupted");
}
System.out.println("main terminated");
}}

