import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
  We're going to make our own Contacts application.
  https://www.hackerrank.com/challenges/ctci-contacts/problem
*/
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        NavigableMap<String, Object> contacts = new TreeMap<String, Object>();
        for(int a0 = 0; a0 < n; a0++){
            String op = in.next();
            String contact = in.next();
            if("add".equals(op)){
                contacts.put(contact, contact);
            }else if("find".equals(op)){
               System.out.println(contacts.subMap(contact, contact+Character.MAX_VALUE).size());
            }
        }
    }
}
