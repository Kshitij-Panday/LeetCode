class Solution {
    public double average(int[] salary) {
        Arrays.sort(salary);
        double finalValue = 0.0;
        double len = salary.length-2;
        for(int i = 1; i < salary.length-1; i++){
            finalValue += salary[i];

        }
        return finalValue/len;
    }
}