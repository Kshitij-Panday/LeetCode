class Solution {
    public void sortColors(int[] nums) {
       boolean swapped;

    for (int i = 0; i < nums.length; i++) {

      swapped = false;

      // after each pass, largest element moves to the end
      for (int j = 1; j <= nums.length - i - 1; j++) {

        // swap if current element is smaller
        if (nums[j] < nums[j - 1]) {

          int temp = nums[j];
          nums[j] = nums[j - 1];
          nums[j - 1] = temp;

          swapped = true;
        }
      }

      // if no swapping happened, array is sorted
      if (!swapped) {
        break;
      }
    }
    }
}