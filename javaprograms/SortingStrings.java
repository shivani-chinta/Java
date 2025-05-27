import java.util.Arrays;
import java.util.Scanner;
public class SortingStrings 
{
    public static void main(String[] args) 
    {
        int num;
        String temp;
        Scanner s = new Scanner(System.in); 
        System.out.print("Enter number of strings : ");
        num = s.nextInt();         
        String str[] = new String[num];
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the Strings one by one:");
        for(int i = 0; i < num; i++)
        {
            str[i] = s1.nextLine();
        }         
        //Sorting the strings
        for (int i = 0; i < num; i++) 
        {
            for (int j = i+1; j < num; j++) 
            { 
                if (str[i].compareTo(str[j]) > 0)//compareTo() returns int value of -> ascii value of str[i] - str[j] where a mismatch occurs or 0 if both are equal
                {
                    temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                }
            }
        }
       System.out.print("Strings in Sorted Order: " + Arrays.toString(str));
       //System.out.println("Strings in Sorted Order: ");
       // for(int i = 0; i < num; i++)
       // {
       //  System.out.println(str[i]);
       // }
    }
}