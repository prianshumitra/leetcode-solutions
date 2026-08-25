class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<List<Integer>> list3 = new ArrayList<>();

        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        for(int i=0; i < nums1.length; i++) set1.add(nums1[i]);

        for(int i=0; i < nums2.length; i++) set2.add(nums2[i]);

        for(int i=0; i < nums1.length; i++) {
            if(!set2.contains(nums1[i])) {
                if(!list1.contains(nums1[i])) {
                    list1.add(nums1[i]);
                }
            }
        }

        for(int i=0; i < nums2.length; i++) {
            if(!set1.contains(nums2[i])) {
                if(!list2.contains(nums2[i])) {
                    list2.add(nums2[i]);
                }
            }
        }

        list3.add(list1);
        list3.add(list2);

        return list3;
    }
}