package MethodQuestion;
class test{//user defined class
    public void draw(){//methode inside class
        System.out.println("Drawing shape");
    }
    public void erase(){//method inside class
        System.out.println("Erasing Shape");
    }
}

public class Q1 {//main class
    public static void main(String[] args) {
        test obj1=new test();//creating object
        obj1.draw();//calling..method  by the help of objects
        obj1.erase();

    }
}
