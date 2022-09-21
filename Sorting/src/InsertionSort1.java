import java.util.*;
import java.lang.*;
import java.io.*;

public class InsertionSort1 {

        public static void main (String[] args) throws java.lang.Exception
        {
            //your code here
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int[] a=new int[n];
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
            }
            int temp=a[n-1];
            int i;
            for(i=n-2;i>=0;i--)
            {
                if(a[i]>temp)
                {
                    a[i+1]=a[i];
                    for(int k=0;k<n;k++)
                    {
                        System.out.print(a[k]+" ");
                    }
                    System.out.println();
                }
                else
                {
                    a[i+1]=temp;
                    for(int k=0;k<n;k++)
                    {
                        System.out.print(a[k]+" ");
                    }
                    System.out.println();
                    break;
                }
            }
            if(i==-1)
            {
                a[0]=temp;
                for(int k=0;k<n;k++)
                {
                    System.out.print(a[k]+" ");
                }
                System.out.println();

            }

        }
    }


