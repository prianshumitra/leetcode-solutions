class Solution {

    boolean isVowel(char ch) {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' ||
            ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' ||
            ch == 'O' || ch == 'U') {
            return true;
        }
        return false;
    }

    public int maxVowels(String s, int k) {
        int container = 0;
        int max = 0;
        int n = s.length(); 

        for(int i=0; i < k; i++) {
            if(isVowel(s.charAt(i))) {
                    container++;
            }
        }

        max = Math.max(container,max);

        for(int i=k; i < n; i++) {
            //sliding window logic
            if(isVowel(s.charAt(i))) {
                    container++;
            }
            if(isVowel(s.charAt(i-k))) {
                    container--;
            }

            max = Math.max(container,max);
        }


        return max;
    }
}