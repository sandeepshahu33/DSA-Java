package LeetCode_Daily;
import java.util.ArrayList;

/*
Problem: Distribute Elements Into Two Arrays I

Approach:
Use two ArrayLists, arr1 and arr2, to store the elements.
Add the first element to arr1 and the second element to arr2.
For each remaining element, compare the last elements of arr1 and arr2.
If the last element of arr1 is greater, add the current element to arr1.
Otherwise, add it to arr2.
Finally, copy all elements of arr1 followed by arr2 back into the nums array.

Time Complexity: O(n)
Space Complexity: O(n)
*/


public class DistributeElement {
    public static int[] resultArray(int[] nums) {

        int n = nums.length;

        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();

        arr1.add(nums[0]);
        arr2.add(nums[1]);

        for (int i = 2; i < n; i++) {

            if (arr1.get(arr1.size() - 1) > arr2.get(arr2.size() - 1)) {
                arr1.add(nums[i]);
            } else {
                arr2.add(nums[i]);
            }
        }

        int i = 0;

        for (int ele : arr1) {
            nums[i] = ele;
            i++;
        }

        for (int ele : arr2) {
            nums[i] = ele;
            i++;
        }

        return nums;
    }

    public static void main(String[] args) {

        int[] nums = {2, 1, 3, 3};

        int[] result = resultArray(nums);

        for (int ele : result) {
            System.out.print(ele + " ");
        }
    }
}
