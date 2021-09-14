package MethodQuestion;

import java.util.Scanner;

class abc{
    String a;
    public void check(){
        Scanner sc=new Scanner(System.in);
        a=sc.nextLine();
        if (a.length()==0){
            System.out.println("No Value");
        }
        else{
            System.out.println(a.split(String.valueOf(',')));
            }
        }
    }



public class CheckArgumentRecevingOrNot {
    public static void main(String[] args) {
        abc obj=new abc();
        obj.check();
    }
}
