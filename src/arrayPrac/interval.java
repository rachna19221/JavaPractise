package arrayPrac;
/*Given an array of intervals where intervals[i] = [start_i, end_i], merge all overlapping intervals, and return an array of the non-overlapping intervals that cover all the intervals in the input.

You may return the answer in any order.

Note: Intervals are non-overlapping if they have no common point. For example, [1, 2] and [3, 4] are non-overlapping, but [1, 2] and [2, 3] are overlapping.
*/

//Input: intervals = [[1,3],[1,5],[6,7]]
//Output: [[1,5],[6,7]]

/*Input: intervals = [[1,2],[2,3]]

Output: [[1,3]]
*/


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.*;
public class interval {
    public static int[][] merge(int[][] intervals) {
       // Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        List<int[]> m=new ArrayList<>();
        for(int[] in:intervals){
            if(m.isEmpty()|| m.get(m.size()-1)[1]<in[0]){
                m.add((in));
            }else{
                m.get(m.size()-1)[1]=Math.max(m.get(m.size()-1)[1],in[1]);
            }

        }
        return m.toArray(new int[m.size()][]);


    }

    public static void main(String[] args) {
        int [][] intervals={{1,3},{1,5},{6,7}};
        int [][] r=merge(intervals);
        for(int[] result:r){
            System.out.println(Arrays.toString(result));
        }
    }

}
