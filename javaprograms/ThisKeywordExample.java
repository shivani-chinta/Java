class A{
    int a;
    A(int a)
    {
        this.a=a;
    }
}
public class ThisKeywordExample
{
	public static void main(String[] args) {
	    A obj=new A(15);
	    System.out.println(obj.a);
	}
}