class Solution {
    public boolean isPowerOfThree(int n) {
       int mul = 1;
       if(n == 1){
        return true;
       }
       for(int i =1; i<21;i++){
        mul *= 3;
       if(mul == n){
        return true;
       }
       }

       return false;
    }
}