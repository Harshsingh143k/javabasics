package p2;
class one{//grand father

}
class two extends one{//father

}
class three extends two{//child

}

public class Test67 {
public static void m1(three obj){
    System.out.println("okk");
}
public static void m1(one obj){
    System.out.println("hello");

}

    public static void main(String[] args) {//first we pri\
    m1(null);
    }
}
/*
overloadig

 */
