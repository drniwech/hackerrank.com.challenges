import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
  https://www.hackerrank.com/challenges/ctci-array-left-rotation/problem
  Given an array  of  integers and a number, , perform  left rotations on the array. 
  Return the updated array to be printed as a single line of space-separated integers.
*/
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        //int a[] = new int[n];
        /*for(int a_i = 0; a_i < n; a_i++){
            //modular: 1%5=1, 2%5=2, 3%5=3, 4%5=4, 5%5=0
            int newLocation = (a_i + (n - k)) % n;
            a[newLocation] = in.nextInt();
        }
        for(int i =0; i<n;i++){
            System.out.print(a[i]+" ");
        }
        */
        /*String a[] = new String[n];
        for(int i=0; i< n; i++){
            int position = (i-k)<0? (i-k+n): i-k;
            a[position] = in.next();
        }
        System.out.print(String.join(" ",a));
        */
        List<String> list = new ArrayList<String>();
        for(int i=0; i<n; i++){
            list.add(in.next());
        }
        List<String> newList = list.subList(k, n);
        newList.addAll(list.subList(0, k));
        System.out.print(String.join(" ", newList));
    }
}
