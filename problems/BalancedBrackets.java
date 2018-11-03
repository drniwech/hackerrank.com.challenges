import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
  https://www.hackerrank.com/challenges/ctci-balanced-brackets/problem
  Given  strings of brackets, determine whether each sequence of brackets is balanced. 
  If a string is balanced, print YES on a new line; otherwise, print NO on a new line.
*/
public class Solution {
    
    public static boolean isBalanced(String expression) {
        if(expression.length()%2 > 0) return false;
        Stack<Character> rights = new Stack<Character>();
        char[] chars = expression.toCharArray();
        for(char left: chars){
            switch(left){
                case '(': rights.push(')'); break;
                case '{': rights.push('}'); break;
                case '[': rights.push(']'); break;
                default : 
                    if(rights.isEmpty() || left!=rights.pop()) return false;
            }
        }
        return rights.isEmpty();
        
    }
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            String expression = in.next();
            System.out.println( (isBalanced(expression)) ? "YES" : "NO" );
        }
    }
}
