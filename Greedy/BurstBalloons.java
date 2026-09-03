package Greedy;

import java.util.Arrays;
import java.util.Comparator;

/*

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