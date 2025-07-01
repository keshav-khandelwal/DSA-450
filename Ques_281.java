import java.util.*;

public class Ques_281 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Stack<Character> st = new Stack<>();
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            st.push(ch);
        }
        while (st.size() != 0) {
            res.append(st.pop());
        }
        res.toString();
        System.out.println(res);
        sc.close();
    }
}
