package StackProblem;

import java.util.Stack;

/**
 * SimplifyPath
 */
public class SimplifyPath {

    public static  String simplifyPath(String path) {

        Stack<String> st = new Stack<>();
        int n = path.length();
        int i = 0;

        while (i < n) {

            String str = "";

            // Directory name collect karo
            while (i < n && path.charAt(i) != '/') {
                str += path.charAt(i);
                i++;
            }

            // Empty ya "." ko ignore karo
            if (str.equals("") || str.equals(".")) {
                // do nothing
            }
            // ".." => previous directory
            else if (str.equals("..")) {
                if (!st.isEmpty()) {
                    st.pop();
                }
            }
            // Normal directory/file name
            else {
                st.push(str);
            }

            i++;
        }

        StringBuilder ans = new StringBuilder();

        for (String s : st) {
            ans.append("/").append(s);
        }

        return ans.length() == 0 ? "/" : ans.toString();
    }
    public static void main(String[] args) {
        String  path = "/home/user/Documents/../Pictures";
        System.out.println(simplifyPath(path));
    }
}