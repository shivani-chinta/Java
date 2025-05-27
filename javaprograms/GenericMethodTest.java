public class GenericMethodTest //works only with Wrappertype
{
 // generic method printArray
 public static < E > void printArray( E[] inputArray )
{
 // Display array elements
 for(E element : inputArray)
 {
 System.out.printf("%s ", element);
 }
 System.out.println();
 }
 public static void main(String args[])
{
 // Create arrays of Integer, Double and Character
 Integer[] intArray = { 1, 2, 3, 4, 5 };
 Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
 Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };
 System.out.println("integerArray contains:");
 printArray(intArray); // passing an Integer array
 System.out.println("\ndoubleArray contains:");
 printArray(doubleArray); // passing a Double array
 System.out.println("\ncharacterArray contains:");
 printArray(charArray); // passing a Character array
 }
}