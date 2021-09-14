package p2;

public class Test {
    public static void main(String[] args) {
        Exam obj=new Exam();
        Exam obj1=new Exam();
        Exam obj2 =new Exam();
        obj1.setvalue(56,80);//overeloading of method...concept
        obj2.setvalue(67,800,"MS");
        obj.display();
        obj1.display();
        obj2.display();


    }
}
