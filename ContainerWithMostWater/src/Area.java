
public class Area {
	  public static int maxArea(int A[], int len)
	    {
	        int line1Index = 0;
	        int width = len - 1;
	        int line2Index =  width =  len - 1;
	        int area = 0;
	     
	        while (line1Index < line2Index)
	        {
	            // Calculating the max area
	        	 int height =  Math.min(A[line1Index], A[line2Index]);
	            area = Math.max(area,
	                        height * width);
	                         
	            if (A[line1Index] < A[line2Index]) {
	                line1Index += 1;	
	                width -= 1;
	            } else {
	                line2Index -= 1;
	                width -= 1;
	            }

	        }
	        return area;
	    }
	     
	    public static void main(String[] args)
	    {
	        int b[] = {1,8,6,2,5,4,8,3,7};
	        int a[] = {3, 1, 2, 4, 5};
	     
	        int len1 = 5;
	        System.out.print( maxArea(a, len1)+"\n" );
	     
	        int len2 = 9;
	        System.out.print( maxArea(b, len2) );
	    }
}
