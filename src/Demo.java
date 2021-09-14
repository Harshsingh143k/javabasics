import java.util.Scanner;

public class Demo {
    int rollno;
//    public void setValue(){
//        rollno=1;
 //   }
//    Demo(){
//        super();
//    }
    Demo(){//non parameterized
        super();
        Scanner sc=new Scanner(System.in);
        rollno=sc.nextInt();
    }
    Demo(int x){ //parameterized
        rollno=x;
    }
    public void printValue(){
        System.out.println(rollno);
    }
}
class DemoMAin{
    public static void main(String[] args) {
        Demo obj = new Demo();
        Demo obj1 = new Demo(11);
       // System.out.println(obj.a);
      //  obj.setValue();
        obj.printValue();
        obj1.printValue();
    }
}
