package MethodQuestion;

import java.util.Scanner;

class patient{
    String name;
    double height;
    double weight;
    double BMI;
    public void computerBMI(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter name");
        name=sc.nextLine();
        System.out.println("enter height in meter");
        height=sc.nextDouble();
        System.out.println("enter weight in kg");
        weight=sc.nextDouble();
        BMI= weight /(height*height);
        System.out.println("BMI is "+ BMI);
    }
}
public class BmiCalculator {
    public static void main(String[] args) {
        patient obj=new patient();
        obj.computerBMI();
    }
}




