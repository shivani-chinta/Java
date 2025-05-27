import java.io.File;//gives the properties of mentioned file
import java.util.Date;
class FileDemo
{
static void p(String s)
{ 
System.out.println(s);
}
public static void main(String args[])
{
File f1 = new File("FileDemo.java");
p("File Name: " + f1.getName());
p("Path: " + f1.getPath());
p("Abs Path: " + f1.getAbsolutePath());
p("Parent: " + f1.getParent());
p(f1.exists() ? "file exists" : "file does not exist");
p(f1.canWrite() ? "is writeable" : "is not writeable");
p(f1.canRead() ? "is readable" : "is not readable");
p("is " + (f1.isDirectory() ? "" : "not" + " a directory"));
p(f1.isFile() ? "is normal file" : "is not a normal file");
p("File last modified: " + f1.lastModified());
p("File size: " + f1.length() + " Bytes"); }
}