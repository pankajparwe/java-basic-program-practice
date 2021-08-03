package Playing_with_string;

import java.util.Arrays;
import java.util.Locale;

public class String_anagram_advanced {
    public static void main(String[] args) {
        String x="listen is";
        String y="silent si";
        x.replace(" ","");// replacing space to nonspace
        y.replace(" ","");

        x=x.toLowerCase();
        y=y.toLowerCase();

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
