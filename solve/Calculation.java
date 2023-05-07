package solve;

import java.util.Scanner;

import static java.lang.System.in;
//10869
public class Calculation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(in);
        System.out.print("A값을 입력하세요 :"); int a = sc.nextInt();
        System.out.print("B값을 입력하세요 :"); int b= sc.nextInt();

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);

    }
}
