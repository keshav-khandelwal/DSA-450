import java.util.Scanner;

public class Ques_94 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("A = ");
        int a = sc.nextInt();
        System.out.print("B = ");
        int b = sc.nextInt();
        System.out.print("C = ");
        int c = sc.nextInt();
        if (a > b) {
            if (b > c) {
                System.out.print(b);
            } else if (c > a) {
                System.out.print(a);
            } else {
                System.out.print(c);
            }
        } else {
            if (a > c) {
                System.out.print(a);
            } else if (c > b) {
                System.out.print(b);
            } else {
                System.out.print(c);
            }
        }
        sc.close();
    }
}
