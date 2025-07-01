import java.util.*;

public class Ques_280 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Given String: ");
        String str = sc.nextLine();
        System.out.println(isBalanced(str));
        sc.close();
    }

    public static boolean isBalanced(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } else {
                if (st.size() == 0 && (ch == ')' || ch == '}' || ch == ']')) {
                    return false;
                } else {
                    if ((ch == ')' && st.peek() == '(') || (ch == '}' && st.peek() == '{')
                            || (ch == ']' && st.peek() == '[')) {
                        st.pop();
                    } else {
                        return false;
                    }
                }
            }
        }
        if (st.size() == 0) {
            return true;
        } else {
            return false;
        }
    }

}
