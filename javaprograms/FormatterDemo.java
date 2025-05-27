import java.util.*; 
class FormatterDemo 
{ 
    public static void main(String args[]) 
    { 
        // create Formatter class object 
        Formatter f = new Formatter(); 
  
        // + sign specifier 

        f.format("%+d", 111); 
        System.out.println(f); 
        f = new Formatter(); 
        f.format("%(d",-111); 
        System.out.println(f);

        f = new Formatter(); 
        f.format("unit4%nrevision"); 
	System.out.println(f);
    }
}
