
public class Fibonocci {
	
	public int getFibonocci(int n, int[] mem) {
		
		mem[0] = 1;
		mem[1] = 1;
		for(int i=2; i<n; i++) {
			mem[i] = mem[i-1] + mem[i-2];
			
		}
		return mem[n - 1];
	}

}
