//synchronisation(allowing only one object to access it at a time) using synchronised keyword-we synchronize the method definition
//synchronisation is achieved using mutual exclusion and inter thread communication
class Callme
{
synchronized void call(String msg)//synchronizing the method definition
{
System.out.print("["+msg);
try
{
Thread.sleep(1000);
}
catch(Exception e)
{}
System.out.println("]");
}
}

class Caller implements Runnable
{
Callme target;
String msg;
Thread t;
public Caller(Callme targ,String s)
{
target=targ;
msg=s;
t=new Thread(this);
t.start();
}
 public void run()
{
target.call(msg);
}
}

class Synchronization1
{
public static void main(String args[])
{
Callme target=new Callme();
Caller  ob1= new Caller  (target,"shivi");
Caller ob2=new Caller  (target,"rishika");
Caller  ob3=new Caller  (target,"aish");
try
{
ob1.t.join();
ob2.t.join();
ob3.t.join();
}
catch(Exception e1)
{}
}}
