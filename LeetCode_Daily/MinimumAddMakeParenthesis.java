package LeetCode_Daily;

// import java.sql.Time;
import java.util.Stack;

/*
Approach
    Use two counters: open and add.
    open stores the number of unmatched opening parentheses (.
    If the current character is (, increment open.
    If the current character is ):
    If open > 0, match it with an existing ( by decrementing open.
    Otherwise, there is no matching (, so increment add because one ( needs to be inserted.
    After traversing the string, remaining open parentheses need closing ) brackets.
    Therefore, the minimum additions required are add + open.

Complexity
    Time Complexity: O(n) — Traverse the string once.
    Space Complexity: O(1) — Only two counters are used.
*/
public class MinimumAddMakeParenthesis {
    // Time Complexity: O(n) — 
    // Space Complexity: O(n) — 
    public static  int minAddToMakeValid1(String s) {
        Stack<Character> st = new Stack<>();
        int n = s.length();
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                st.push(ch);
            } else {
                if (!st.isEmpty()) {
                    char top = st.peek();
                    if (top == '(')
                        st.pop();
                    else {
                        st.push(ch);
                    }

                } else {
                    st.push(ch);
                }

            }
        }
        return st.size();
    }
    // Time Complexity: O(n) — Traverse the string once.
    // Space Complexity: O(1) — Only two counters are used.
    public static int minAddToMakeValid2(String s) {
        int n = s.length();
        int open = 0;
        int add = 0;
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                open++;
            } else {
                if (open > 0) {
                    open--;
                } else {
                    add++;
                }
            }
        }
        return add + open;
    }

    public static void main(String[] args) {
        String s = "(((";
        System.out.println(minAddToMakeValid1(s));
    }
}
