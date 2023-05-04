import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
	    public int[][] merge(int[][] intervals) {
	    	Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
	        int endInterval = intervals[0][1];
	        List<int[]> result = new ArrayList<int[]>();
	        result.add(new int[] { intervals[0][0], endInterval});
	        int index = 0;
	        for(int i=1; i< intervals.length; i++) {
	            if(intervals[i][0] <= endInterval) {
	                endInterval = Math.max(endInterval, intervals[i][1]);
	                int start = result.get(index)[0];
	                result.set(index, new int[] { start, endInterval });
	            } else {
	                index ++;
	                endInterval = Math.max(endInterval, intervals[i][1]);
	                result.add(new int[] { intervals[i][0], endInterval });
	            }
	        }
	        return result.toArray(new int[result.size()][2]);
	    }
}
