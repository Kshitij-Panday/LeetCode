class Solution {
    public int numSub(String s) {
        long count = 0;
        long streak =0;
       for(int i =0; i<s.length();i++){
           if(s.charAt(i) == '1'){
            streak +=1;
            count = (count + streak) % 100_000_000_7;

           }
           else{
            streak = 0;
            
           }

       } 
       return (int)count;
    }
}