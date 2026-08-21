package Strings;

/*
Problem: Integer to Roman

Approach:
1. Store Roman values and symbols in descending order.
2. Use a Greedy Approach to select the largest possible value.
3. Add the corresponding Roman symbol and subtract the value.
4. Use while loop for repeated symbols.
5. Include special values like 900, 400, 90, 40, 9, and 4.

Time Complexity: O(1)
Space Complexity: O(1)
*/

public class IntegerToRoman {
    public static String intToRoman(int num) {
        String roman="";
        int[] values={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] romanLetters={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        for(int i=0;i<values.length;i++){
            while(num >= values[i]){
                roman += romanLetters[i];
                num -= values[i];
            }
        }
        return roman;
    }
    public static void main(String[] args) {
        System.out.println(intToRoman(3556));
    }
}
