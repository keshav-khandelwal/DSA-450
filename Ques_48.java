//.............................. CHECK STRING IS PALINDROME OR NOT  ..........................................................

// ....................  NAIVE APPROACH  ..............................

// import java.util.*;

// public class Ques_48 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("String : ");
//         String a = sc.next();
//         if (apalindrome(a)) {
//             System.out.println("String is Palindrome");
//         } else {
//             System.out.println("String is Not Palindrome");
//         }
//         sc.close();
//     }

//     public static boolean apalindrome(String a) {
//         a = a.toLowerCase();
//         String res = "";
//         for (int i = 0; i < a.length(); i++) {
//             res = a.charAt(i) + res;
//         }
//         return a.equals(res);
//     }
// }

//.......................... USING STRING BUILDER ......................
// import java.util.*;

// public class Ques_48 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("String : ");
//         String a = sc.next();
//         if (apalindrome(a)) {
//             System.out.println("String is Palindrome");
//         } else {
//             System.out.println("String is Not Palindrome");
//         }
//         sc.close();
//     }

//     public static boolean apalindrome(String a) {
//         StringBuilder b = new StringBuilder(a);
//         b.reverse();
//         return a.equals(b.toString());
//     }
// }

//.................................. USING TWO POINTER ........................................

import java.util.*;

public class Ques_48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("String : ");
        String a = sc.next();
        if (apalindrome(a)) {
            System.out.println("String is Palindrome");
        } else {
            System.out.println("String is Not Palindrome");
        }
        sc.close();
    }

    public static boolean apalindrome(String a) {
        int i = 0;
        int j = a.length() - 1;
        while (i < j) {
            if (a.charAt(i) != a.charAt(j)) {
                return false;
            } else {
                i++;
                j--;
            }
        }
        return true;
    }
}