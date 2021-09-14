import java.util.Scanner;

class test {//main class
    int num;
    int rev;
    int copy;

    test() {//constructor
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        rev = 0;
        copy=num;
    }

    public void pal() {

        while (num != 0) {
            int cpy = num % 10;
            rev = rev * 10 + cpy;
            num = num / 10;
        }

        if (copy == rev) {
            System.out.println("number is palindrome");
        } else {
            System.out.println("number is not a palindrome");
        }

    }
}

public class Palindrome {//

    public static void main(String[] args) {
        test obj = new test();
        obj.pal();


    }


}
