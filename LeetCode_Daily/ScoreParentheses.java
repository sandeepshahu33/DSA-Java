package LeetCode_Daily;

import java.util.Stack;

/*
Approach
    Use a Stack<Integer> to store the score of each parenthesis group.
    Push 0 initially to maintain the score of the outermost group.
    When ( is encountered, push 0 to start a new group.
    When ) is encountered, pop the current group's score.
    If the popped score is 0, it represents (), so its score is 1.
    Otherwise, it represents (A), so its score becomes 2 * A.
    Add the calculated score to the previous group in the stack.
    Finally, the remaining value in the stack is the total score.
Complexity
    Time Complexity: O(n) — Each character is processed once.
    Space Complexity: O(n) — In the worst case, the stack can contain n/2 elements.
*/
public class ScoreParentheses {
    public static  int scoreOfParentheses(String s) {
        Stack<Integer> st = new Stack<>();
        int n=s.length();
        st.push(0);
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                st.push(0);
            } else {
                int inner = st.pop();
                if (inner == 0) {
                    st.push(st.pop() + 1);
                } else {
                    st.push(st.pop() + 2 * inner);
                }
            }
        }
        return st.pop();
    }
    public static void main(String[] args) {
        String s = "(()())";
        System.out.println(scoreOfParentheses(s));
    }
}
