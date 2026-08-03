class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        int[] sorted = new int[nums.length];

        for (int num : nums) {
            if (num % 2 == 0) {
                sorted[left] = num;
                left++;
            } else {
                sorted[right] = num;
                right--;
            }
        }
        return sorted;
    }
}