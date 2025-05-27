//synchronisation using synchronized block-we synchronize method call on a particular object
class Callme
{
 void call(String msg)
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
synchronized(target)//synchronizing method call on a particular object
{
target.call(msg);
}
}
}

class Synchronization
{
public static void main(String args[])
{
Callme target=new Callme();
Caller  ob1= new Caller  (target,"shivi");
Caller ob2=new Caller  (target,"rishika");
Caller  ob3=new Caller  (target,"shriya");
try
{
ob1.t.join();
ob2.t.join();
ob3.t.join();
}
catch(Exception e1)
{}
}}
