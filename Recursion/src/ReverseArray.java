import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        reverseArray(a,0,n-1);
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
    public static void reverseArray(int[] a,int i,int j)
    {
        if(i>=j)
        {
            return;
        }

        else
        {
            swap(a,i,j);
            reverseArray(a,i+1,j-1);
        }
    }
    public static void swap(int[] a,int i,int j)
    {
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
}
