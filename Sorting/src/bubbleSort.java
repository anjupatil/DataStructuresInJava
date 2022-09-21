import java.util.*;
import java.lang.*;
import java.io.*;





public class bubbleSort {
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
            bubble(a);




        }
        public static void bubble(int[] arr)
        {
            int swap=0;
            for(int i=0;i<arr.length;i++)
            {
                for(int j=1;j<arr.length-i;j++)
                {
                    if(arr[j-1]>arr[j])
                    {
                        int temp=arr[j];
                        arr[j]=arr[j-1];
                        arr[j-1]=temp;
                        swap++;
                    }
                }
            }
            System.out.println("Array is sorted in "+swap+" swaps.");
            System.out.println("First Element: "+arr[0]);
            System.out.println("Last Element: "+arr[arr.length-1]);

        }
    }

