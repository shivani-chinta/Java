//inter thread communication -communication by polling (the situation to check some condition repeatedly, to take appropriate action, once the condition is true.)
class Q
{
boolean valueset=false;//initially the consumer has consumed 
int n;
synchronized void put(int n)
{
if(valueset)
{
try{ wait(); } catch(Exception e){}//cant produce until the consumer consumes the item
}
this.n=n;
valueset=true;
System.out.println("PRODUCED :"+n);
notify();
}
synchronized int get()
{
if(!valueset)
{
try{ wait(); } catch(Exception e){}//cant consume until the producer produces the item
}
System.out.println("CONSUMED :"+n);
System.out.println();
valueset=false;
notify();
return n;
}
}

class Producer implements Runnable
{
Q q;
int i=0;
Producer(Q q)
{
this.q=q;
new Thread(this).start();
} 
public void run()
{
while(i<10)
{
q.put(i++);
}
}
}

class Consumer implements Runnable
{
Q q;
Consumer(Q q)
{
this.q=q;
new Thread(this).start();
} 
public void run()
{
while(true)
{
q.get();
}
}
}

public class ProducerConsumer
{
public static void main(String args[])
{
Q q=new Q();
Producer ob=new Producer(q);
Consumer ob1=new Consumer(q);
System.out.println("Press ctrl+c to stop");
}
}
