import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Solution s = new Solution();
		List<Integer> result = s.findAnagrams("cbaebabacd", "abc");
		System.out.println(Arrays.toString(result.toArray()));

	}

}
