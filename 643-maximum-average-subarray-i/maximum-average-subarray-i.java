class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double max=0.0;
        int n = nums.length;
        int sum = 0;
        if(n == 1){
            return nums[0]/1;
        }
        
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        max = sum;

        for (int i = k; i < n; i++) {
            sum += nums[i];
            sum -= nums[i - k];

            max = Math.max(max, sum);
        }
        return max/k;
    }
}