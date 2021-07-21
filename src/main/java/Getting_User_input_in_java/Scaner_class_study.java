package Getting_User_input_in_java;

import java.util.Scanner;

public class Scaner_class_study {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("enter name");
        String name =s.next();// next() method used for strings
        System.out.println("name entered by the user is "+name);

        System.out.println("enter age");
        int age =s.nextInt();
        System.out.println("age of "+name+" is "+age);
    }
}
