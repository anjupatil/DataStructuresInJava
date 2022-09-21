import java.util.*;
import java.lang.*;
import java.io.*;

public class FibonacciSequence {
    public static void main (String[] args) throws java.lang.Exception
    {
        //your code here
        Scanner sc=new Scanner(System.in);
        int n1=0,n2=1;
        int n=sc.nextInt();
        int res=fib(n);
        System.out.print(res);
    }
    public static int fib(int n)
    {

        if(n==0)
            return 0;
        else if(n==1)
            return 1;
        else
            return fib(n-1)+fib(n-2);

    }
}
