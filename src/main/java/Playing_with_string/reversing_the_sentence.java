package Playing_with_string;
public class reversing_the_sentence{
    public static void main(String[] args) {
        String s ="my name my";
        String sarray[]=s.split(" ");
        String rev= "";
        for(int i=sarray.length-1;i>=0;i--)
        {
             rev=rev+sarray[i]+" ";
        }
        System.out.println(rev);
        if(rev.equals(s))
        {
            System.out.println("string is palindrome");
        }else
        {
            System.out.println("string is not palindrome");
        }
    }
}
