
public class Solution {
	    public long minimumTime(int[] time, int totalTrips) {
	        int minTimeUnit = time[0];
	        long minTime =  time[0];
	        for(int i: time) {
	            if(i< minTimeUnit) {
	                minTimeUnit = i;
	                minTime = i;
	            }
	        }
	        long maxTime = (long) totalTrips * minTimeUnit;
	        long result = maxTime;
	        long midTime;
	        while (minTime <  maxTime) {
	        midTime = (minTime + maxTime) / 2;
	        long possibleTrips = getPossibleTrips(time, midTime);
	       // System.out.println(possibleTrips);
	         if(possibleTrips >= totalTrips) {
	             maxTime = midTime;
	             result = Math.min(result, midTime);
	         } else if(possibleTrips < totalTrips) {
	           minTime = midTime + 1;
	         } 
	        }

	        return result;
	    }

	 public long getPossibleTrips(int[] time, long givenTime) {
	     long possibleTrips = 0;

	     for(int i: time) {
	         possibleTrips += givenTime / i;
	     }

	     return possibleTrips;
	 }
	
}
