package MethodQuestion;

import javax.print.DocFlavor;
import java.util.Scanner;

class test2{
    String a;
    public void Wlcm(){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter name");
        a=sc.nextLine();
        System.out.println("welcome "+a);
    }
}
public class WelcomeMessage {
   public static void main(String[] args){
       test2 obj=new test2();
       obj.Wlcm();
   }
}
