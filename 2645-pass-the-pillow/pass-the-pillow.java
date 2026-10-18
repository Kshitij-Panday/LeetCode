class Solution {
    public int passThePillow(int n, int time) {
        int cycle = 2 * (n - 1);
        int t = time % cycle;

        if (t <= n - 1) {
            return t + 1;
        }

        return n - (t - (n - 1));
    }
}