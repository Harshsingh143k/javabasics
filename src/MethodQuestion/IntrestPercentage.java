package MethodQuestion;

import java.util.Scanner;

class test1{//class
    String gender;//loval variable
    int age;
//    float interest;
    test1(){//constructor
        Scanner sc=new Scanner(System.in);
        System.out.println("enter gender");
        gender=sc.nextLine();
        System.out.println("enter age");
        age=sc.nextInt();

    }
    public void gender(){//method
        if (gender.equals("male")){
            if ((1<=age)||(age<=58)){
                System.out.println("gender "+gender);
                System.out.println("age "+age);
                System.out.println("Interest  8.4%");
            }
           else if((59<=age)||(age<=100))  {
                System.out.println("gender "+gender);
                System.out.println("age "+age);
                System.out.println("Interest 10.5%");

            }
           else{
                System.out.println("plz...correct age of male");
            }

        }
        //......................................for female........
        else if(gender.equals("female")){
            if ((1<=age)||(age<=58)){
                System.out.println("gender "+gender);
                System.out.println("age "+age);
                System.out.println("interest "+"8.2%");
            }
            else if ((59<=age)||(age<=100)){
                System.out.println("gender "+gender);
                System.out.println("age "+age);
                System.out.println("interest "+"9.2%");

            }
            else{
                System.out.println("plz...correct age of female");
            }

        }
        else{
            System.out.println("wrong gender...plz correct your gender input");
        }
    }

}

public class IntrestPercentage {
    public static void main(String[] args) {
        test1 obj=new test1();
        obj.gender();

    }
}
