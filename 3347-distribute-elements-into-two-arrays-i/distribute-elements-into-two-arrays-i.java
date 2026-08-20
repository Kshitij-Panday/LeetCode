class Solution {
    public int[] resultArray(int[] nums) {

        int[] arr1 = new int[nums.length];
        int[] arr2 = new int[nums.length];
        int[] result = new int[nums.length];
        arr1[0] = nums[0];
        arr2[0] = nums[1];

        int index1 = 1;
        int index2 = 1;

        for (int i = 2; i < nums.length; i++) {

            if (arr1[index1 - 1] > arr2[index2 - 1]) {
                arr1[index1] = nums[i];
                index1++;
            } else {
                arr2[index2] = nums[i];
                index2++;
            }
        }
        System.arraycopy(arr1, 0, result, 0, index1);
        System.arraycopy(arr2, 0, result, index1, index2);

        return result;
    }
}