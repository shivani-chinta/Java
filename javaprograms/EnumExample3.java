class EnumExample3// is a datatype containing fixed set of constants which are static and final implicitly and it internally extends Enum class
{
enum Season{WINTER(15), SPRING(1), SUMMER(15), FALL(20);//enum can have fields,constructors and methods
int value;
Season(int value)
{
this.value=value;
}}
public static void main(String args[])
{
for (Season s : Season.values())
System.out.println(s+" "+s.value);
}} 