class Solution {
    public int jump(int[] nums) {
        
        int jumps = 0;
        int left = 0;
        int right = 0;
        int farthest;

        while (right <  nums.length-1) {
            farthest = 0;
            for (int i = left; i <= right; i++) {
                farthest = Math.max(i+nums[i],farthest);
            }
            left = right+1;
            right = farthest;

            jumps++;
        }
        return jumps;
    }
}