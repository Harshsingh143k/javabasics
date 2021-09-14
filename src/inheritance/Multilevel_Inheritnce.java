package inheritance;

import org.w3c.dom.ls.LSOutput;

class grandfather{
    public void m1(){
        System.out.println("hello i m from grand_parent class.....having in directly relation with child class");

    }
    public void m4(){
        System.out.println("......helllllooooo........");
    }

}
class father extends grandfather{
    public void m2(){
        System.out.println("hello i am from parent class ...having directly relation with child class..inheriting the properties only from.grand parent ");
    }

}
class child extends father{
    public void m3(){
        System.out.println("hello i m from child class ....having directly relation with fatheer class.....inheriting the properties of both grandfather and father");
    }

}

public class Multilevel_Inheritnce {
    public static void main(String[] args) {
        child obj=new child();
        obj.m1();
        obj.m2();
        obj.m3();
        obj.m4();
    }
}
