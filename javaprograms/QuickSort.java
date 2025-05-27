//QUICKSORT
public class QuickSort
{ 
 static void quickSort(int a[], int beg, int end)  
    {            
        int loc;  
        if(beg<end)  
        {  
            loc = partition(a, beg, end);  
            quickSort(a, beg, loc-1);  
            quickSort(a, loc+1, end);  
        }  
     }
public static int partition(int a[], int lb, int ub)  
    {  
          
        int pivot,start,end;     
        pivot=lb;
        start=lb;
        end=ub;
        while(start<end)
          {
            while(a[pivot] >= a[start])
            start++;
            while(a[end]>a[pivot])
            end--;
            if(start<end)
              swap(a,start,end);
          }
        swap(a,lb,end);
        return end;
}
public static void swap( int a[],int i,int j)
{
               int temp;
               temp = a[i];
                a[i]=a[j];
                a[j]=temp;
}
 public static void main(String[] args)
 {  
        int i;  
        int[] arr={90,23,101,45,65,23,67,89,34,23};  
        quickSort(arr, 0, 9);  
        System.out.println("\n The sorted array is:");  
        for(i=0;i<10;i++)  
        System.out.println(arr[i]);  
 }
}