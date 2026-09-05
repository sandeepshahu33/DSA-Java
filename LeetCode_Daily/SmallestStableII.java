package LeetCode_Daily;
/*
Approach
    Create a prefMax array to store the maximum value from index 0 to i.
    Create a suffMin array to store the minimum value from index i to n-1.
    For each index i, calculate the instability score:
    prefMax[i] - suffMin[i]
    If the score is less than or equal to k, return that index as the first stable index.
    If no stable index is found, return -1.
Complexity
    Time Complexity: O(n)
    Space Complexity: O(n)
*/
public class SmallestStableII {
    public static  int firstStableIndex(int[] nums, int k) {
        int n=nums.length;
        int[] prefMax=new int[n];
        int[] suffMin=new int[n];
        prefMax[0]=nums[0];
        suffMin[n-1]=nums[n-1];
        for(int i=1;i<n;i++){
            prefMax[i]=Math.max(prefMax[i-1],nums[i]);
        }
        for(int i=n-2;i>=0;i--){
            suffMin[i]=Math.min(suffMin[i+1],nums[i]);
        }
        for(int i=0;i<n;i++){
            int gap=prefMax[i]-suffMin[i];
            if(gap<=k)return i;
        }
        return -1;

    }
    public static void main(String[] args) {
        int[] arr = {5,0,1,4};
        int k = 3;
        System.out.println(firstStableIndex(arr,k));
    }
}
