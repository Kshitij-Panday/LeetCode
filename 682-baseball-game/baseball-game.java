class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        int ans = 0;
        for(int i = 0;i<operations.length;i++){
            String s = operations[i];
            if(s.equals("C")){
                stack.pop();
            }
            else if(s.equals("D")){
                stack.push(stack.peek()*2);
            }
            else if(s.equals("+")){
                int a = stack.pop();
                int b = stack.pop();
                int sum = a+b;
                stack.push(b);
                stack.push(a);
                stack.push(sum);
            }
            else{
                stack.push(Integer.parseInt(s));
            }
        }
        while(!stack.isEmpty()){
            ans += stack.pop();
        }
        return ans;
    }
}