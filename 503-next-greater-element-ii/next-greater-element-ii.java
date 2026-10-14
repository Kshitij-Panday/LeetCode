class Solution {
    public int[] nextGreaterElements(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int n = arr.length;
        int[] nge = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            stack.push(arr[i]);
        }

        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[i] >= stack.peek()) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                nge[i] = -1;
            } else {
                nge[i] = stack.peek();
                
            }
        stack.push(arr[i]);
        }
        return nge;
    }
}