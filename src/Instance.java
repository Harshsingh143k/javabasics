public class Instance {
    int a;
    int b;
    static int count;
    {
        count++;
    }
    Instance(){
    //    count++;
        a=12;
        b=10;
    }
    Instance(int x,int y){
    //    count++;
        a=x;
        b=y;
    }
//    public void show(){
//        System.out.println(a);
//        System.out.println(b);
//    }
}
class InstaMAin{
    public static void main(String[] args) {
        Instance obj1=new Instance();
        Instance obj2=new Instance(10,20);
        System.out.println(Instance.count);
    }
}
