class Solution {
    public String reversePrefix(String word, char ch) {
       StringBuilder ans = new StringBuilder();
       int index = word.indexOf(ch);
       String a = word.substring(0,index+1);
       String b = word.substring(index+1);

       ans.append(a);
       ans.reverse();
       ans.append(b);

       return ans.toString();

    }
}