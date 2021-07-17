package Finding_Numbers_From_list;

public class prime_number_from_1to100 {

    public static void main(String[] args) {

        for(int i =2 ; i<=100; i++){

           int count=0;
            for(int j=1; j<=i-1; j++){
                if(!(i%j==0)){
                   count= count+1;

                }if(count==i-2)
                {
                    System.out.println(i);
                }
            }


            }

        }

    }

