package Finding_Numbers_From_list;

public class Fibonacci_series {
    //next number can be obtained by adding previous two numbers
    public static void main(String[] args) {
        int k1=0;
        int k2=1;
        int k3;
      //  System.out.println(k1);
      //  System.out.println(k2);
        for(int i=0;i<8;i++)
        {
        k3=k1+k2;
        System.out.println(k3);
        k1=k2;
        k2=k3;
        }
    }
}
