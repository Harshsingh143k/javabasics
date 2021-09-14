package testing;
import java.util.Scanner;

class patent{
    String PatientName;
    double height,weight;
    double bmi;
    patent() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter name");
        PatientName = sc.nextLine();
        System.out.println("enter height");
        height = sc.nextDouble();
        System.out.println("enter weight");
        weight = sc.nextDouble();
    }
    public void CompBmi(){
        bmi=weight/(height*height);
        System.out.println("patient name is "+PatientName+" and BMI is "+bmi);
    }
}
public class Testing {
    public static void main(String[] args) {
        patent obj=new patent();
        obj.CompBmi();

    }
}
