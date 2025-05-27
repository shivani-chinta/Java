class A
{
    int a,b;
    A()
    {
        a=4;b=5;
    }
    A(int x,int y)
    {
        a=x;b=y;
    }
    void display()
    {
        System.out.println(a+" "+b);
    }
}
public class ConstOverloading
{
    public static void main(String args[])
    {
        A ob1=new A();
          ob1.display();
        A ob2=new A(14,15);
          ob2.display();
    }
}