import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> generate(int numRows) {
    	List<List<Integer>> result = new ArrayList<List<Integer>>();
    	for(int i =0; i< numRows; i ++) {
        	List<Integer> rowsList = new ArrayList<Integer>();
        	for(int j=0; j<=i; j ++) {
        		if(j== 0 || j == i) {
        			rowsList.add(1); 			
        		} else {
        			rowsList.add(result.get(i-1).get(j-1) + result.get(i-1).get(j));
        		}
        		
        	}
    		result.add(rowsList);
    	}
    	
    	return result;
    }
}
