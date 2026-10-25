
class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        if (n == 0) return;

        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            q.add(nums[i]);
        }

        k = k % n;

        for (int i = 0; i < n - k; i++) {
            q.add(q.remove());
        }

        for (int i = 0; i < n; i++) {
            nums[i] = q.remove();
        }
    }
}

