package inheritance;
class parent {
    public void m2(){
        System.out.println("i am from parent class ");
    }

}
class son  extends parent{//inheriting the method of parent class in the son class
    public void m1(){
        System.out.println("i am from son class");
    }

}
public class Single_leve_Inheritance {
    public static void main(String[] args) {
        son obj=new son();//making object of son class and it is inheriting the parent class
        obj.m1();//object of son class
        obj.m2();//object of parent class



    }

}
