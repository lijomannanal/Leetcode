import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Solution s = new Solution();
		int [][] input = new int[][]{{2,3},{2,2},{3,3},{1,3},{5,7},{2,2},{4,6}};
		int[][] result = s.merge(input);
		System.out.println(Arrays.deepToString(result));

	}

}
