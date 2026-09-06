package Strings;
/*
Approach
    Traverse the string from right to left.
    Convert each character into its corresponding value using:
    ch - 'A' + 1
    For each character, multiply its value by the corresponding power of 26.
    Add all values to get the final column number.
    The power of 26 starts from 0 and increases for every character.
Complexity
    Time Complexity: O(n) — We traverse the string once.
    Space Complexity: O(1) — Only a few variables are used.
*/
class ExcelColumn {
    public static  int titleToNumber(String columnTitle) {
        int sum = 0;
        int n = columnTitle.length();
        int p = 0;
        for (int i = n - 1; i >= 0; i--) {
            char ch = columnTitle.charAt(i);
            int num = ch - 'A' + 1;
            sum += num * (Math.pow(26, p));
            p++;
        }
        return sum;
    }
    public static void main(String[] args) {
        String columnTitle = "ZY";
        System.out.println(titleToNumber(columnTitle));
    }

}