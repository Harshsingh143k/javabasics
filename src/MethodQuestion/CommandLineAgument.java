package MethodQuestion;

import java.util.Scanner;
class testing{
    String a;
    String b;

    public void display(){
        Scanner sc=new Scanner(System.in);
        a=sc.nextLine();
        b=sc.nextLine();
        System.out.println(a+" university "+b);

    }

}
public class CommandLineAgument {
    public static void main(String[] args) {
        testing obj= new testing();
        obj.display();




    }
}
