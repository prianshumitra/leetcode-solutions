class Solution {
    public int findPeakElement(int[] nums) {
        int peakIndex = 0;

        for(int i=1; i<nums.length-1; i++) {
            if(nums[i]>nums[i-1] && nums[i]>nums[i+1]) peakIndex = i;
        }
        
        if (nums.length > 1 && nums[nums.length - 1] > nums[nums.length - 2]) {
            peakIndex = nums.length - 1;
        }
        return peakIndex;
    }
}