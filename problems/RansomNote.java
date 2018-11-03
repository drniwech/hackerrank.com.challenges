import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
  https://www.hackerrank.com/challenges/ctci-ransom-note/problem
  Given the words in the magazine and the words in the ransom note, 
  print Yes if he can replicate his ransom note exactly using whole words from the magazine; otherwise, print No.
*/
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        Map<String, Integer> mags = new HashMap<String, Integer>();
        for(int magazine_i=0; magazine_i < m; magazine_i++){
            String word = in.next();
            mags.put(word, null==mags.get(word)? 1: mags.get(word)+1);
        }
        
        for(int ransom_i=0; ransom_i < n; ransom_i++){
            String word = in.next();
            if(mags.get(word)==0){
                System.out.print("No");
                return;
            }else if(mags.get(word)>0){
                mags.put(word, mags.get(word)-1);
            }
        }
        System.out.print("Yes");
        
        
    }
}
