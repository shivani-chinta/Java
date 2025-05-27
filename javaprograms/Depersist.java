import java.io.*;
class Depersist
{
 public static void main(String args[])throws Exception//readObject() and close() throws IOException
{
 FileInputStream fin= new FileInputStream("f.txt");
 ObjectInputStream in=new ObjectInputStream(fin);
 Student s=(Student)in.readObject();//type cast from object to student
 System.out.println(s.id+" "+s.name);
 in.close();
} }