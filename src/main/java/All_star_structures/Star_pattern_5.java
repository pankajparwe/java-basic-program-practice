package All_star_structures;

public class Star_pattern_5 {
    public static void main(String[] args) {
        for(int i=1;i<=4;i++)
        {
            for(int j=1;j<=4-i;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int l=1;l<=3;l++)
        {
            for(int m=1;m<=l;m++)
            {
                System.out.print(" ");
            }
            for(int n=4-l;n>=1;n--)
            {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
//   *
//  **
// ***
//****
// ***
//  **
//   *
