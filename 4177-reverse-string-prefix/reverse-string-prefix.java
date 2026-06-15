class Solution {
    public String reversePrefix(String s, int k) {
        String a = s.substring(0,k);
        String b = s.substring(k);
        StringBuilder ans = new StringBuilder();
        ans.append(a);
        ans.reverse();
        ans.append(b);
        return ans.toString();
    }
}