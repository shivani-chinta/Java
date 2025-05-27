//copying from one file to another when files are given in command line arguments
import java.io.*;
class CopyFile{
public static void main(String args[]) throws IOException// because read() and close() throw IOException
{
int i;
FileInputStream fin;
FileOutputStream fout;
try {
// open input file
try
{
fin = new FileInputStream(args[0]);
}
catch(FileNotFoundException e)
{
System.out.println("Input File Not Found");
return;
}
// open output file
 try
{
fout = new FileOutputStream(args[1]);
 }
 catch(FileNotFoundException e)
{
System.out.println("Error Opening Output File");
return;
}
}
catch(ArrayIndexOutOfBoundsException e) 
{ System.out.println("U DIDNOT GIVE FILE NAMES IN COMMANDLINE");
 return;
}
// Copy File
 try
 {
do {
i = fin.read();
if(i != -1)
fout.write(i);
 }
 while(i != -1);
}
catch(IOException e)
{ System.out.println("File Error");
}
fin.close(); fout.close();
} }