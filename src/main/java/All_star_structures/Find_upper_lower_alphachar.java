package All_star_structures;

public class Find_upper_lower_alphachar {
    public static void main(String[] args) {
        char c;
        String name= "pankaj@PArwe 2021";
        int cap=0;
        int small=0;
        int space=0;
        int num=0;
        int special=0;
        for (int i =0; i<name.length(); i++)
        {
             c=name.charAt(i);
            if(c>='A' && c<='Z')
                cap++;
            else if(c>='a' && c<='z')
                small++;
            else if(c>='0' && c<='9')
                num++;
            else if(c==' ')
                space++;
            else
                special++;

        }
        System.out.println("Analysing the string "+name);
        System.out.println("number of upper case in the string "+cap);
        System.out.println("number of lower case in the string "+small);
        System.out.println("number of numbers in the string "+num);
        System.out.println("number of spaces in the string "+space);
        System.out.println("number of special character in the string "+special);

    }
}
