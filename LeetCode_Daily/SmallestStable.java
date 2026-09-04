package LeetCode_Daily;

/**
 * SmallestStable
 */
public class SmallestStable {

    public int firstStableIndex(int[] nums, int k) {
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
}