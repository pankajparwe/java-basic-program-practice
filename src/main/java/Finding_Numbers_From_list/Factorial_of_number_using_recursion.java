package Finding_Numbers_From_list;

public class Factorial_of_number_using_recursion {
    int fact=1;
    public static void main(String[] args) {
        //recursion means writing same method inside the method, so same method is executing repeatatively

        int no= 5; int res;
        Factorial_of_number_using_recursion ft =new Factorial_of_number_using_recursion();
        res=ft.calfact(no);
        System.out.println(res);
    }
    int calfact(int no){
        if(no>1){
            fact =fact*no;
            calfact(no-1);


        }
        return fact;
    }
}
