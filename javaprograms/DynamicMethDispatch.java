class One 
{
    void show()
    {
        System.out.println("In class One");
    }
}
class Two extends One
{
    void show()
    {
        System.out.println("In class Two");
    }
}
class Three extends One 
{
    void show()
    {
        System.out.println("In class Three");
    }
    void display()
    {
        System.out.println("In class Three display function ");        
    }
}
public class DynamicMethDispatch 
{
    public static void main(String[] args)
    {
        One ob;
        ob=new Two();//super class reference variable reffering to subclass object
        ob.show();//the execution of overridden method depends on type of object and not reference variable
        ob=new Three();
        ob.show();
        // ob.display();
    }    
}