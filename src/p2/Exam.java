package p2;

public class Exam {//we  are going to learn
    int rollno;
    String course;
    int marks;
    Exam()
    {
        rollno =0;
        course ="unknown";
        marks=90;

    }
    public void setvalue(int rollno,int marks ){
      this.rollno=rollno;
      this.marks=marks;

    }
    public void setvalue(int rollno,int marks,String course){
        this.rollno=rollno;
        this.marks=marks;
        this.course=course;

    }


//    public Exam(int rollno, String course, int marks) {
//        this.rollno = rollno;
//        this.course = course;
//        this.marks = marks;
//    }
//
//    public Exam(int rollno) {
//        this.rollno = rollno;
//        course="mca";
//        marks=80;
//
//    }
    public void display(){
        System.out.println(rollno+"  "+marks+"  "+course);
    }


}
