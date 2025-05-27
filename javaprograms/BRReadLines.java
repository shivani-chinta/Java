import java.io.*;
class BRReadLines//reading console string input
{
public static void main(String args[]) throws IOException
{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 String str;
System.out.println("Enter lines");
System.out.println("Enter 'stop' to quit.");
do
{
str = br.readLine();
System.out.println(str);
} while(!str.equals("stop"));
}
}
