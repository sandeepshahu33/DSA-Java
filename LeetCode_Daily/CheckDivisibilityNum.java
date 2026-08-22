package LeetCode_Daily;

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
