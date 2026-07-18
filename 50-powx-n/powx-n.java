class Solution {
    public double myPow(double x, int n) {
        long N = n;
        if (N < 0) {
            x = 1 / x;
            N = -N;
        }
        return pow(x, n);
    }

    private double pow(double x, int n) {

        if (n == 0) {
            return 1;
        }
        double temp = pow(x, n / 2);

        if (n % 2 == 0) {
            return (temp * temp);
        } else
            return (x * temp * temp);

    }
}