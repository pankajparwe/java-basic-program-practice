package Finding_Numbers_From_list;

public class finding_prime_number {
    public static void main(String[] args) {
        int n=9973;
        int i;
        int count=0;
        for(i=2;i<=n-1;i++)
        {
            if(!(n%i==0))
            {
              count=count+1;
            }
        }
        if(count==n-2)
        {
            System.out.println("number is prime");
        }else{
            System.out.println("number is composite");
        }

    }
}
