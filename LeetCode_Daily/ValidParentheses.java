package LeetCode_Daily;

import java.util.Stack;

/*
Approach
    Use a Stack to store opening brackets.
    Traverse the string character by character.
    Push opening brackets into the stack.
    For closing brackets, check whether the top of the stack contains its matching opening bracket.
    If matched, pop it; otherwise return false.
    At the end, return true only if the stack is empty.

Complexity
    Time Complexity: O(n)
    Space Complexity: O(n)
 */
public class ValidParentheses {
    public static  boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        int n = s.length();
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } else {
                if (!st.isEmpty()) {
                    char top = st.peek();
                    if (top == '(' && ch == ')') {
                        st.pop();
                    } else if (top == '{' && ch == '}') {
                        st.pop();
                    } else if (top == '[' && ch == ']') {
                        st.pop();
                    } else {
                        return false;
                    }
                } else
                    return false;

            }
        }
        if (st.size() == 0)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        String s = "()[]{}";
        System.out.println(isValid(s));
    }
}