package All_star_structures;

public class Star_pattern_pyramid_1_2 {
    public static void main(String[] args) {
        for(int i=1;i<=4;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int k=1;k<=3;k++)
        {
            for(int l=3;l>=k;l--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
//*
//**
//***
//****
//***
//**
//*