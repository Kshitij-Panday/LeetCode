class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int[] sorted = new int[nums.length];
        int even = 0;
        int odd = 1;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] % 2 == 0){
                sorted[even] = nums[i];
                even += 2;
            }
            else{
                sorted[odd] = nums[i];
                odd += 2;
            }
        }
        return sorted;
    }
}