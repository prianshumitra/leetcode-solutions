class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        int[] nums3 = new int[nums1.length];

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < nums1.length; i++) {
            set.add(nums1[i]);
        }

        for (int i = 0; i < nums2.length; i++) {

            if (set.contains(nums2[i])) {

                int greater = -1;

                for (int j = i + 1; j < nums2.length; j++) {

                    if (nums2[j] > nums2[i]) {
                        greater = nums2[j];
                        break;
                    }
                }

                
                for (int k = 0; k < nums1.length; k++) {
                    if (nums1[k] == nums2[i]) {
                        nums3[k] = greater;
                        break;
                    }
                }
            }
        }

        return nums3;
    }
}