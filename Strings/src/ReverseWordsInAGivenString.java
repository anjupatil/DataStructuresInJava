import java.util.*;
import java.lang.*;
import java.io.*;


public class ReverseWordsInAGivenString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();

        String[] str=s.split(".");
        String rev="";
        for(int i=str.length-1;i>=0;i--)
        {
            rev=rev+str[i]+".";
        }
        System.out.println(rev);
    }
}
