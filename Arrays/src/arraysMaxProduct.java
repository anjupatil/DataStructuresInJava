import java.util.*;
import java.io.*;

public class arraysMaxProduct {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int max1=a[0];
        int ind1=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]>max1)
            {
                max1=a[i];
                ind1=i;
            }
        }
        int max2=a[0];
        for(int i=0;i<n;i++)
        {
            if(i!=ind1)
            {
                if(a[i]>max2)
                    max2=a[i];
            }
        }
        System.out.println((max1-1)*(max2-1));

    }
}
