class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int start = starting(weights);
        int end = ending(weights);

        while(start < end){
            int mid = start + (end - start)/2;
            if(canShip(weights,mid,days)){
                end = mid;
            }
            else{
                start = mid + 1;
            }
        }
        return start;
    }

    boolean canShip(int[] weights, int capacity, int days) {
        int currentLoad = 0;
        int daysUsed = 1;
        for (int weight : weights) {
            if (currentLoad + weight > capacity) {
                daysUsed++;
                currentLoad = weight;
            } else {
                currentLoad += weight;
            }

        }
        return daysUsed <= days;
    }

    int starting(int[] weights) {
        int max = weights[0];

        for (int weight : weights) {
            max = Math.max(max, weight);
        }

        return max;
    }

    int ending(int[] weights) {
        int sum = 0;
        for (int weight : weights) {
            sum += weight;
        }
        return sum;
    }

}