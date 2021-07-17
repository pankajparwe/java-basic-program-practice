package Finding_Numbers_From_list;

public class reversing_the_number {
    public static void main(String[] args) {
        int n=232;
        int org=n;
        int rev=0;
        int rem;
         while(n>0){
             rem=n%10;
             n=n/10;
             rev=rev*10+rem;

         }
        System.out.println("original number is "+org);

        System.out.println("reversed number is "+rev);
         if(org==rev){
             System.out.println("given number is palindrome");

         }
    }

}
