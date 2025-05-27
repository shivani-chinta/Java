import java.util.*;  
class NameComparator implements Comparator<StudentComparator>
{  
public int compare(StudentComparator s1,StudentComparator s2)
{  
return s1.name.compareTo(s2.name);  
}  
}  
