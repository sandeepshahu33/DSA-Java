package Arrays;

import java.util.HashMap;
import java.util.Map;

/*
Problem: Divide Array Into Equal Pairs

Approach:
Use a HashMap to store the frequency of each element.
If any element occurs an odd number of times, return false.
Otherwise, return true.

Time Complexity: O(n)
Space Complexity: O(n)
*/

public class DivideArray {
    public static boolean divideArray(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int ele:nums){
            if(map.containsKey(ele)){
                map.put(ele,map.get(ele)+1);
            } else {
                map.put(ele,1);
            }
            
        }
        for(int key : map.keySet()){
            if(map.get(key)%2 != 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {

        int[] nums = {3, 2, 3,2, 2, 2};

        boolean result = divideArray(nums);

        System.out.println(result);
    }
}

