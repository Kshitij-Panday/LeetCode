class Solution {
    public int[] canSeePersonsCount(int[] heights) {
        int n = heights.length;
        int [] ans = new int[n];
        Stack<Integer> stack = new Stack<>();
        stack.push(heights[n-1]);
        heights[n-1] = 0;
        for(int i = n-2; i>=0;i--){
            int count = 0;
            while(!stack.isEmpty() && stack.peek()<= heights[i]){
                count++;
                stack.pop();
                
            }
                if(stack.size()>0){
                    count++;
                }
                ans[i] = count;
                stack.push(heights[i]);
            


        }
        return ans;
    }
}