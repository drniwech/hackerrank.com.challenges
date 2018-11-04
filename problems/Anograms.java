import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
  https://www.hackerrank.com/challenges/ctci-making-anagrams/problem
  Alice decides on an encryption scheme involving two large strings where encryption is dependent on 
  the minimum number of character deletions required to make the two strings anagrams. 
  Can you help her find this number?
*/
public class Solution {
    public static int numberNeeded(String first, String second) {
      //placeholder for 26 alphabets
      int[] aToZ = new int[26];
      //loop through the first string
      for(char letter : first.toCharArray()){
          int index = letter-'a';//calculate asci value
          aToZ[index]=aToZ[index]+1; //increase value by 1
      }
      //loop through the second string  
      for(char letter : second.toCharArray()){
          int index = letter-'a';//calculate asci value
          aToZ[index] = aToZ[index]-1; //decrease value by 1
      }
      int result = 0;
      for(int x: aToZ){
          result=result+ Math.abs(x); //abs(-1)=1, abs(1)=1
      }
      return result;
    }
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
    }
}
