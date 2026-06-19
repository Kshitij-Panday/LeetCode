class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int count = 0;
        for(String character : patterns){
            if(word.contains(character)){
                count++;
            }
        }
        return count;
    }
}