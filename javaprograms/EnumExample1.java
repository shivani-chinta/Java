class EnumExample1
{
public enum Season { WINTER, SPRING, SUMMER, FALL }
 public static void main(String[] args) {
for (Season s : Season.values())//enhanced for loop also known as for-each lopp
System.out.println(s);
}}