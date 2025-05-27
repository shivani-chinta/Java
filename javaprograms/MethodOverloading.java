class P
{
    void fun()
{
    System.out.println("hi");
}
void fun(int x)
{System.out.println(x);}
void fun(double d)
{System.out.println(d);}
}
public class MethodOverloading
{
    public static void main(String args[])
    {
        P ob=new P();
          ob.fun();
          ob.fun(25);
          ob.fun(37.9);
    
    }
}
