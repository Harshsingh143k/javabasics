package MethodQuestion;

import java.util.Scanner;

class test3{
    int a;
    String c;
    int b;



    public void add(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter  number");
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println("the sum of "+a+" and"+b+" is "+(a+b));

    }

}
public class AdditionOfTwoNumbers {
    public static void main(String[] args) {
        test3 obj=new test3();
        obj.add();

    }

}
