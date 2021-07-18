package Playing_with_string;

public class Reverse_of_word_of_sentence {
    public static void main(String[] args) {
        String s ="my name is shail";
        String sp[]=s.split(" ");
        String rev="";
        String revnew=" ";
        for(int i=0;i<=sp.length-1;i++)
        {
            rev=sp[i]+" ";
            for(int j=rev.length()-1;j>=0;j--)
            {
                revnew= revnew+rev.charAt(j);
            }
        }
        System.out.println(rev);
        System.out.println(revnew);

    }
}
