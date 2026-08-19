class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int container = 0;
        int sum = 0;
        int n = arr.length;

        for(int i = 0; i < k; i++) {
            sum += arr[i];
        }
        if(sum/k >= threshold) {
            container++;
        }

        for(int i = k; i < n; i++) {
            sum += arr[i];
            sum -= arr[i - k];
            if(sum/k >= threshold) {
                container++;
            }
        }
        return container;
    }
}