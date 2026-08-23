package Arrays;

import java.util.ArrayList;
import java.util.List;
/*
Approach:-
    Use a pointer i to traverse the array.
    Store the starting element of each range.
    Move i while consecutive elements are found.
    Add either a single number or start->end to the result.
    
Complexity:-
    Time: O(n)
    Space: O(1) (excluding output list)
*/

public class SummaryRanges {
    public static List<String> summaryRanges(int[] nums) {

        List<String> list = new ArrayList<>();
        int n = nums.length;
        int i = 0;

        while (i < n) {

            int start = nums[i];

            while (i + 1 < n && nums[i] + 1 == nums[i + 1]) {
                i++;
            }

            int end = nums[i];

            if (start == end) {
                list.add(String.valueOf(start));
            } else {
                list.add(start + "->" + end);
            }

            i++;
        }

        return list;
    }
    public static void main(String[] args) {
        int[] nums = {0,1,2,4,5,7};
        System.out.println(summaryRanges(nums));
    }
}
