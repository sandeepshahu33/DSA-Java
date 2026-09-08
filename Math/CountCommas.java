package Math;
/*
Approach
    Agar n <= 999 hai, to kisi number me comma nahi aayega → 0.
    1000 se lekar n tak har number me at least one comma hai.
Complexity
    Time: O(1)
    Space: O(1)
*/
public class CountCommas {
    public static  int countCommas(int n) {
        if(n<=999)return 0;
        return n-999;
    }
    public static void main(String[] args) {
        int  n = 1002;
        System.out.println(countCommas(n));
    }
}
