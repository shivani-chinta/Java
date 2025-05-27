import java.util.*;  
class AgeComparator implements Comparator<StudentComparator>
{  
public int compare(StudentComparator s1,StudentComparator s2)
{  
if(s1.age==s2.age)  
return 0;  
else if(s1.age>s2.age)  
return 1;  
else  
return -1;
}
}
