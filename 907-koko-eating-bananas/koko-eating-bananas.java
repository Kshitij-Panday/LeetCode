class Solution {
    public int minEatingSpeed(int[] piles, int h) {
       int start = 1;
        int end = max(piles);
        while(start < end){
            int mid = start + (end - start)/2;
            
            if(finish(piles,h,mid)){
                end = mid;
            }
            else{
                start = mid + 1;
            }
        }
        return start; 
    }
    boolean finish(int[] piles,int h,int speed){
      int hours = 0;
      for (int pile : piles){
        hours = hours + (int) Math.ceil((double)pile/speed);

      }
      return hours <=h; 
    }
    int max(int [] piles){
        int end = piles[0];
        for(int i = 0 ; i<piles.length ; i++){
            if(end < piles[i]){
                end = piles[i];
            }
        }
        return end;
    }
    
}