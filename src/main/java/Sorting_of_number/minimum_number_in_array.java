package Sorting_of_number;

public class minimum_number_in_array {
    public static void main(String[] args) {

        int a[]={2,5,7,6,85,75};
        int min = a[0];
        for(int i=0; i<(a.length);i++)
        {
            if (min>a[i])
            {
                min=a[i];
            }
        }
        System.out.println(min);

   }
}
