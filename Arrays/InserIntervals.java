package Arrays;

import java.util.ArrayList;
/*
Approach
    Traverse the intervals using a pointer i.
    First, add all intervals that end before the new interval starts because they cannot overlap.
    Then, merge all overlapping intervals by:
    Taking the minimum start value.
    Taking the maximum end value.
    Add the merged newInterval to the result.
    Finally, add all the remaining intervals that come after the merged interval.
    Convert the ArrayList<int[]> into a 2D array and return it.

Complexity
    Time Complexity: O(n) — Each interval is visited at most once.
    Space Complexity: O(n) — Extra space is used to store the result intervals.
*/

public class InserIntervals {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        ArrayList<int[]> res=new ArrayList<>();
        // Store intervals before overlap
        int i=0;
        int n=intervals.length;
        while(i<n && intervals[i][1]<newInterval[0]){
            res.add(intervals[i]);
            i++;
        }
        // merge overlapping intervals if any
        while(i<n && newInterval[1]>=intervals[i][0]){
            newInterval[0]=Math.min(newInterval[0],intervals[i][0]);
            newInterval[1]=Math.max(newInterval[1],intervals[i][1]);
            i++;
        }
        res.add(newInterval);
        // append the remaining intervals
        while(i<n){
            res.add(intervals[i]);
            i++;
        }
        n=res.size();
        int[][] ans=new int[n][2];
        for(int j=0;j<n;j++){
            ans[j]=res.get(j);
        }
        return ans;
    }
}
