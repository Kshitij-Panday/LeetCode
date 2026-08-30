class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;

        int max = max(nums);
        int min = min(nums);

        int maxIndex = 0;
        int minIndex = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] == max) {
                maxIndex = i;
            }
            if (nums[i] == min) {
                minIndex = i;
            }
        }

        int first = Math.min(maxIndex, minIndex);
        int last = Math.max(maxIndex, minIndex);

        int front = last + 1;
        int back = n - first;
        int both = (first + 1) + (n - last);

        return Math.min(front, Math.min(back, both));
    }

    

    public int max(int[] nums) {
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (max < nums[i]) {
                max = nums[i];
            }
        }
        return max;
    }

    public int min(int[] nums) {
        int min = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (min > nums[i]) {
                min = nums[i];
            }
        }
        return min;
    }
}