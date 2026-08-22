class Solution {
    public int minimizedStringLength(String s) {
        HashSet<Character> set = new HashSet<>();
        int count = 0;
        for(char x : s.toCharArray()) {
            if(!set.contains(x)) {
                count++;
                set.add(x);
            }
        }
        return count;
    }
}