package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class App05_MergeIntervals {

    static int[][] merge(int[][] intervals) {
        ArrayList<int[]> res = new ArrayList<int[]>();
        //Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
        //Output: [[1,6],[8,10],[15,18]]

        Arrays.sort(intervals , (a,b)-> a[0] - b[0]);
        int start = intervals[0][0];
        int end = intervals[0][1];

        for(int[] i : intervals){
            if(i[0] <= end){
                end = Math.max(end,i[1]);
            }
            else{
                res.add(new int[] {start,end});
                start = i[0];
                end = i[1];
            }
        }

        res.add(new int[] {start,end});

        return res.toArray(new int[0][]);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int[][] ints = merge(arr);

        for (int[] anInt : ints) {
            for (int i : anInt) {
                System.out.print(i+" ");
            }
        }
    }
}
