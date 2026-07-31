class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int max2 = 1;
        int max3 = 1;
        int max1 =  nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3];
        for(int i = 0; i < 2;i++){
        max2 *=  nums[i];
    }
    max3 = max2* nums[nums.length-1];

    return Math.max(max1,max3);
    }
}