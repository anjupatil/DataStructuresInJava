import java.util.*;
import java.lang.*;
import java.io.*;


public class CheckIfArrayStrictlyIncrease {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        for(int k=0;k<t;k++)
        {
            int flag=-1;
            int n=sc.nextInt();
            int[] a=new int[n];
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
            }

            for(int i=0;i<n-1;i++)
            {
                if(a[i]<a[i+1])
                {
                    flag=1;
                }
                else
                {
                    flag=-1;
                    break;
                }
            }
            if(flag==1)
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }

        }

    }
}

