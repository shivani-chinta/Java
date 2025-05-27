import java.io.*;
class BRRead //reading console char input
{
public static void main(String args[]) throws IOException //since read() throws IOException
{
int c;
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter characters, 'q' to quit.");
 do
{
 c =br.read();
 System.out.println(c);
} while(c != 'q'); 
}
}