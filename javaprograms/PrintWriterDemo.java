// Demonstrate PrintWriter
// writing console output
import java.io.*;
public class PrintWriterDemo
{
public static void main(String args[])
{
PrintWriter pw = new PrintWriter(System.out, true);// constructor used is PrintWriter(OutputStream os, boolean flushOnNewline)
pw.println("This is a string");
int i = -7;
 pw.println(i);
 double d = 4.5e-7;
 pw.println(d);
} }