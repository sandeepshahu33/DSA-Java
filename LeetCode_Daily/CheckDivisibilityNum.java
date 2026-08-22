package LeetCode_Daily;
/*
1. Calculate sum of all digits of n.
2. Calculate product of all digits of n.
3. Add digit sum and digit product.
4. Check whether n is divisible by this value.
5. Return true if divisible, otherwise false.
Time Complexity:
O(log n)

Space Complexity:
O(1)
*/
public class CheckDivisibilityNum {
    public static int digitSum(int n){
        int sum=0;
        while(n>0){
            int rem=n%10;
            sum += rem;
            n /= 10;
        }
        return sum;
    }
    public static int digitMul(int n){
        int mul=1;
        while(n>0){
            int rem = n%10;
            mul *= rem;
            n /= 10;
        }
        return mul;
    }
    public static boolean checkDivisibility(int n) {
        int num=digitSum(n)+digitMul(n);
        if(n%num == 0) return true;
        else return false;
    }
    public static void main(String[] args) {
        System.out.println(checkDivisibility(99));
    }
}
