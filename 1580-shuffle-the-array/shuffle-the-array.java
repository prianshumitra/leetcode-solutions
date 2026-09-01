class Solution {
    public int[] shuffle(int[] nums, int n) {
        int front = 0;
        int rear = n;
        int[] res = new int[nums.length];

        for(int i=0; i < nums.length; i+=2) {
            res[i] = nums[front];
            res[i+1] = nums[rear];
            front++;
            rear++;
        }
        return res;
    }
}