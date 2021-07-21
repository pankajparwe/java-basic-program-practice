package All_star_structures;

public class Star_pattern_6 {
    public static void main(String[] args) {
        for (int i=1;i<=4;i++)
        {
            for (int j=1;j<=4-i;j++)
            {
                System.out.print(" ");
            }
            for (int k=1;k<=i+(i-1);k++)
            {
                System.out.print("*");
            }
            for (int m=1;m<=4-i;m++)
            {
                System.out.print(" ");
            }
            System.out.println();

        }

    }
}
//   *
//  ***
// *****
//*******