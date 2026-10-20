class Solution {
    public int maximalRectangle(char[][] matrix) {
        if (matrix.length == 0) {
            return 0;
        }
        int[] heights = new int[matrix[0].length];
        int largest = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                int val = matrix[i][j] - '0';
                if (val == 0) {
                    heights[j] = 0;
                } else {
                    heights[j] += val;
                }
            }
            int maxArea = largestRectangleArea(heights);
            if (largest < maxArea) {
                largest = maxArea;
            }
            
        }
        return largest;
    }

    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int[] nse = new int[n];
        Stack<Integer> stack = new Stack<>();
        nse[n - 1] = n;
        stack.push(n - 1);
        for (int i = n - 2; i >= 0; i--) {
            while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                nse[i] = n;
            } else {
                nse[i] = stack.peek();
            }
            stack.push(i);
        }
        while (!stack.isEmpty()) {
            stack.pop();
        }
        int[] pse = new int[n];
        pse[0] = -1;
        stack.push(0);
        for (int i = 1; i < n; i++) {
            while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                pse[i] = -1;
            } else {
                pse[i] = stack.peek();
            }
            stack.push(i);
        }
        int maxArea = 0;

        for (int i = 0; i < n; i++) {
            int area = heights[i] * (nse[i] - pse[i] - 1);
            maxArea = Math.max(maxArea, area);
        }
        return maxArea;
    }
}