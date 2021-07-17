package Playing_with_string;

public class palindrom_string {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        String a ="mada";
        String t ="";

        for(int i=a.length()-1; i>=0; i--)
        {
            t=t+a.charAt(i);

        }
        System.out.println(t);
        System.out.println(a);
        if(t.equals(a))
        {
            System.out.println("is a palindrome");

        }else
        {
            System.out.println("number is not a palindrome");
        }
    }


}
