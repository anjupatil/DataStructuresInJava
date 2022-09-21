import java.util.*;
import java.lang.*;


public class ArraySumRecursion {
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

        int sum=sumOfArrayElements(0,0,a);
        System.out.println(sum);


    }
    public static int sumOfArrayElements(int sum,int i,int[] a)
    {
        if(i>a.length-1)
        {
            return sum;
        }
        else
        {
            sum=sum+a[i];
            return sumOfArrayElements(sum,i+1,a);

        }

    }
}

