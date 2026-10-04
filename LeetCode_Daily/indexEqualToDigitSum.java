package LeetCode_Daily;

public class indexEqualToDigitSum {
    public static  int digitSum(int n){
        int sum=0;
        while(n>0){
            int rem=n%10;
            sum += rem;
            n /=10;
        }
        return sum;
    }
    public static  int smallestIndex(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            int sum=digitSum(nums[i]);
            if(i==sum)return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums = {1,10,11};
        System.out.println(smallestIndex(nums));
    }
}
