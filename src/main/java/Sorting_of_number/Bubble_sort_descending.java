package Sorting_of_number;

public class Bubble_sort_descending {
    public static void main(String[] args) {

            int a[]= {3,4,6,2};
            int i;
            int temp;
            for ( i=0;i<a.length-1;i++)
            {
                for (int j=0;j<a.length-1;j++)
                {

                    if(a[j]<a[j+1])
                    {
                        temp=a[j];
                        a[j]=a[j+1];
                        a[j+1]= temp;
                    }
                }
            }
        for(i=0;i<a.length;i++)
        {
            System.out.print(a[i]);
        }

    }
}
