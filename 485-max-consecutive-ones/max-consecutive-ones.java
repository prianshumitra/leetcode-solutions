class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int freq = 0;
        int max = 0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i] == 1) {
                freq++;
            }
            else {
                max = Math.max(max,freq);
                freq = 0;
            }
        }
        
        return Math.max(max,freq);
    }
}