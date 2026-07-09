class Solution {
    public int numberOfSteps(int num) {
       return steps(num,0);
    }
        int steps(int num , int c){
            if(num == 0){
                return c;
            }
            int remainder = num%10;
            if(remainder % 2 == 0){
                return steps(num/2,c+1);
            }
            return steps(num-1,c+1);
        }

}