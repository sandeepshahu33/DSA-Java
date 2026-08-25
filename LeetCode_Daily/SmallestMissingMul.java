package LeetCode_Daily;

import java.util.HashSet;

public class SmallestMissingMul {
    public static int missingMultiple(int[] nums, int k) {
        HashSet<Integer> set=new HashSet<>();
        for(int ele : nums){
            set.add(ele);
        }
        int mul=k;
        while(set.contains(mul)){
            mul = mul+k;
        }
        return mul;
    }
    public static void main(String[] args) {
        int[] arr={8,2,3,4,6};
        System.out.println(missingMultiple(arr,2));
    }
}
