
public class Solution {
    public int[] sortArray(int[] nums) {
        sort(nums, 0, nums.length - 1);
        return nums;   
      }
      public void sort(int[] nums, int leftIndex, int rightIndex)  {
          
          if(leftIndex < rightIndex) {
          int midIndex = (leftIndex + rightIndex)  / 2;
          sort(nums, leftIndex, midIndex);
          sort(nums, midIndex + 1, rightIndex);
          merge(nums, leftIndex, midIndex, rightIndex);
          }

      }

          public void merge(int[] nums, int leftIndex, int midIndex, int rightIndex)  {
              int leftArraySize = midIndex - leftIndex + 1;
              int rightArraySize = rightIndex - midIndex;
              int[] leftArray = new int[leftArraySize];
              int[] rightArray = new int[rightArraySize];

              for(int i=0; i< leftArraySize; i ++ ) {
                  leftArray[i] = nums[leftIndex + i];
              }
              for(int i=0; i< rightArraySize; i ++ ) {
                  rightArray[i] = nums[midIndex + 1 + i];
              }

              int i=0, j = 0, k = leftIndex;

              while ( i < leftArraySize && j < rightArraySize) {
                  if(leftArray[i] <= rightArray[j]) {
                      nums[k] = leftArray[i];
                      i ++;
                  } else {
                      nums[k] = rightArray[j];
                      j ++;
                  }
                  k ++;
              }
              while (i < leftArraySize) {
                   nums[k] = leftArray[i];
                   k ++;
                   i ++;
              }

               while (j < rightArraySize) {
                   nums[k] = rightArray[j];
                   k ++;
                   j ++;
              }

      }
}
