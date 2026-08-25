package LeetCode_Daily;

import java.util.HashSet;
/*
Approach
    Store all elements of nums in a HashSet for fast lookup.
    Start checking multiples from k.
    If the current multiple exists in the set, move to the next multiple by adding k.
    The first multiple that is not present in the set is the answer.

Complexity
    Time: O(n + m)
    Space: O(n)
*/

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
