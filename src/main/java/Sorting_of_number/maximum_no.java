package Sorting_of_number;

public class maximum_no {
    public static void main(String[] args) {

            int a[]= {3,4,6,2};
            int max = a[0];   //this is first element of the array for comparison
            for(int i=1;i<a.length;i++)
            {
                if(max<a[i])
                {
                    max=a[i];
                }
            }
        System.out.print(max);
    }
}
