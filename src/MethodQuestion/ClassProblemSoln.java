package MethodQuestion;

import java.util.Scanner;

class patent{
    String PatientName;
    double height,weight;
    double bmi;
    Scanner sc =new Scanner(System.in);
    patent(){
        System.out.println("enter name");
        PatientName=sc.nextLine();
        System.out.println("enter height");
        height=sc.nextDouble();
        System.out.println("enter weight");
        weight=sc.nextDouble();
        bmi=weight/(height*height);
    }
        public void compbmi(){
            System.out.println("patient name is "+PatientName+"and BMI is "+bmi);


        }





    }




public class ClassProblemSoln {
}
