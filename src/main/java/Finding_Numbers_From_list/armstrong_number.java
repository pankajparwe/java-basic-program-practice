package Finding_Numbers_From_list;

public class armstrong_number {
    //sum of the cubes of digits equal to number
    //153= 1cube + 5cube +3cube
    public static void main(String[] args) {
        int n=157;
        int rev=0;
        int rem;
        int s;
        s=n;
        while(n>0)
        {
          rem=n%10;
          n=n/10;
          rev=rev+rem*rem*rem;
        }
       // System.out.println(rev);
        //System.out.println(s);
        if(rev==s)
        {
            System.out.println("number is armstrong "+rev);
        }
    }
}
