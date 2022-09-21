
import java.util.*;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        selectionSort(a);
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }

    }
    public static void selectionSort(int[] a)
    {
        for(int i=0;i<a.length;i++)
        {
            int last=a.length-i-1;
            int max=getMax(a,0,last);
            swap(a,max,last);
        }
    }

    public static int getMax(int[] a,int start,int last)
    {
        int max=start;
        for(int i=start;i<=last;i++)
        {
            if(a[max]<a[i])
            {
                max=i;
            }
        }
        return max;
    }
    public static void swap(int[] a,int first,int second)
    {
        int temp=a[first];
        a[first]=a[second];
        a[second]=temp;
    }
}
