import java.io.*;
class RandomAccessFileDemo
{
public static void main(String args[])throws IOException
{
RandomAccessFile raf=new RandomAccessFile("sample.txt","rw");
raf.seek(3);
System.out.println((char)raf.read());
raf.seek(5);
System.out.println((char)raf.read());
}}