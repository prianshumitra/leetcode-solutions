class Solution {
    public String mergeAlternately(String word1, String word2) {

        int words = word1.length()+word2.length();
        char[] finalw = new char[words];
        int a,b,j;
        a=b=j=0;

        while(j<words) {
            
            if(a >= word1.length()) {
                finalw[j++] = word2.charAt(b++);
            }

            else if(b >= word2.length()) {
                finalw[j++] = word1.charAt(a++);
            }

            else {
                finalw[j++] = word1.charAt(a++);
                finalw[j++] = word2.charAt(b++);
            }
        }

        StringBuilder final_word = new StringBuilder();
        for(int i=0; i<words; i++) {
            final_word.append(finalw[i]);
        }

        String result = final_word.toString();

        return result;
    }
}