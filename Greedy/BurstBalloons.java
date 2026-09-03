package Greedy;

import java.util.Arrays;
import java.util.Comparator;

/*
Approach
    Intervals ko start point ke according sort karo.
    commonInterval mein un intervals ka common overlapping range maintain karo jo same arrow se burst ho sakte hain.

    Agar current interval overlap karta hai:

    curS <= commonInterval[1]

    toh same arrow use karo aur common range update karo.

    Agar overlap nahi karta, toh new arrow chahiye.
    End mein total arrows return karo.
Complexity
    Time Complexity: O(n log n)
    Sorting → O(n log n)
    Traversal → O(n)
    Overall → O(n log n)
    
Space Complexity: O(log n)
    Arrays.sort() ki internal sorting stack ki wajah se.
    Algorithm ki extra space = O(1).

 */
public class BurstBalloons {
    public int findMinArrowShots(int[][] points) {
        int n=points.length;
        if(n==1) return 1;
        // Sorting 
        Arrays.sort(points, new Comparator<int []>(){
            public int compare(int a1[],int a2[]){
                if(a1[0]==a2[0]) return 0;
                if(a1[0]<a2[0]) return -1;
                return 1;
            }
        });
        int arrows=1;
        int commanInterval[]=  points[0];
        for(int i=1;i<n;i++){
            int curS=points[i][0];
            int curE=points[i][1];
            // if intervals are overlapping then we use existing arrow to burst it 
            if(curS<=commanInterval[1]){
                commanInterval[0]=Math.max(commanInterval[0],curS);
                commanInterval[1]=Math.min(commanInterval[1],curE);
            }else{
                // start a new interval
                commanInterval[0]=curS;
                commanInterval[1]=curE;
                arrows++;
            }
        }
        return arrows;
    }
}