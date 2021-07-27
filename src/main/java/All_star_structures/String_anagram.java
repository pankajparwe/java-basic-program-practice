package All_star_structures;

import java.util.Arrays;

public class String_anagram {
    public static void main(String[] args) {
//        An anagram of a string is another string that
//        contains the same characters, only the order of
//        characters can be different. For example,
//        “abcd” and “dabc” are an anagram of each other.
//        1. lennth should be same
        String x= "silent";
        String y= "listen";

        char a[]= x.toCharArray();//changing char to array
        char b[] =y.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        boolean result= Arrays.equals(a,b);
        if (result == true)
            System.out.println("this is anagram");

        else
            System.out.println("this is not anagram");



    }
}
