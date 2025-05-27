// .............................  BASICS OF STRING BUILDER CLASS ......................................................................
// public class Ques_47 {
//     public static void main(String[] args) {
//         String str = "Tony";
//         String strs = "Sony";
//         StringBuilder sb = new StringBuilder(str);
//         System.out.println(sb);

//         sb.setCharAt(0, 'p');
//         System.out.println(sb);

//         sb.append(strs);
//         System.out.println(sb);

//         sb.insert(0, 's');
//         System.out.println(sb);

//         sb.delete(0, 1);
//         System.out.println(sb);

//         System.out.println(sb.length());
//     }
// }

//............................................   REVERSE A STRING   ......................................................

//....................  NAIVE APPROACH   ...........................

// import java.util.*;

// public class Ques_47 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String an = sc.next();
//         String r = "";
//         int n = an.length();
//         for (int i = 0; i < n; i++) {
//             char ch = an.charAt(i);
//             r = ch + r;

//         }

//         System.out.println(r);
//         sc.close();
//     }
// }

//.............. (the above solution is not optimal because string in java are immutable).......
//................................   OPTIMAL SOLUTION   .................................................................

// import java.util.*;

// public class Ques_47 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String a = sc.next();
//         StringBuilder an = new StringBuilder();
//         an.append(a);
//         an.reverse();

//         System.out.println(an);
//         sc.close();
//     }
// }

//...........................Part 2 ............................
import java.util.*;

public class Ques_47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char[] arr = a.toCharArray();
        int n = arr.length;
        for (int i = 0; i < n / 2; i++) {
            char temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }
        for (int j = 0; j < n; j++) {
            System.out.print(arr[j]);
        }
        sc.close();
    }
}
