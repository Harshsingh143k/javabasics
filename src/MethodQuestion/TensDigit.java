package MethodQuestion;
import java.util.Scanner;
class stu {
    Scanner sc= new Scanner(System.in);
    

    int n=sc.nextInt();
    int a;


    public void main(){
        a=n;
        if (n>0){
            n=n%100;
            n=n/10;
            System.out.println("ten's digit of "+a);
            System.out.println(n);
        }
        else{
            System.out.println("no idea");
        }
    }
}
public class TensDigit {
    public static void main(String[] args) {
        stu obj=new stu();
        obj.main();




    }
}
