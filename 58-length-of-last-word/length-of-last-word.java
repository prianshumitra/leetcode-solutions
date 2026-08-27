class Solution {
    public int lengthOfLastWord(String s) {
        String word = "";
        Stack<String> stack = new Stack<>();

        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == ' ') {
                if(!word.equals("")) {
                    stack.push(word);
                    word = "";
                }
            }
            else word = word + s.charAt(i);
        }

        if(!word.equals("")) {
            stack.push(word);
        }

        return stack.pop().length();
    }
}