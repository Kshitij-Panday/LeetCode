class Solution {
    long mod = 1_000__000_007;

    public int countHomogenous(String s) {
        char prev = '#';
        long count = 0;
        long ans = 0;

        for (char c : s.toCharArray()) {
            if (c == prev) {
                count += 1;

            } else {
                count = 1;
                prev = c;
            }
            ans = (ans + count) % mod;
        }

        return (int) ans;

    }
}