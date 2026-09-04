package LeetCode_Daily;

/*
 Approach
    Create leftMax[] to store the maximum value from 0 to i.
    Create rightMin[] to store the minimum value from i to n-1.
    For each index, calculate:
    gap = leftMax[i] - rightMin[i]
    If gap <= k, return the first such index.
    If no stable index exists, return -1.
Complexity
    Time: O(n)
    Space: O(n)
 */
public class SmallestStable {

    public static  int firstStableIndex(int[] nums, int k) {
        int n=nums.length;
        int[] leftMax=new int[n];
        int[] rightMin=new int[n];
        leftMax[0]=nums[0];
        rightMin[n-1]=nums[n-1];
        for(int i=1;i<n;i++){
            leftMax[i]=Math.max(leftMax[i-1],nums[i]);
        }
        for(int i=n-2;i>=0;i--){
            rightMin[i]=Math.min(rightMin[i+1],nums[i]);
        }
        for(int i=0;i<n;i++){
            int gap=leftMax[i]-rightMin[i];
            if(gap<=k)return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums = {3,2,1}; 
        int k = 1;
        System.out.println(firstStableIndex(nums,k));
    }
}