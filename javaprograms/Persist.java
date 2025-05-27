import java.io.*; 
class Persist
{
 public static void main(String args[])throws Exception//writeObject() flush() throws IOException
{
 Student s1 =new Student(211,"ravi");
 FileOutputStream fout=new FileOutputStream("f.txt");
 ObjectOutputStream out=new ObjectOutputStream(fout);
 out.writeObject(s1);
 out.flush();//flushes the current output stream
 System.out.println("success");
 }
}