package Playing_with_string;

public class palindrom_string {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        String a ="madam";
        String t ="";

        for(int i=a.length()-1; i>=0; i--)
        {
            t=t+a.charAt(i);

        }
        System.out.println(t);
        if(a==t)
        {
            System.out.println("is a polyndrom");

        }else
        {
            System.out.println("No");
        }
    }


}
