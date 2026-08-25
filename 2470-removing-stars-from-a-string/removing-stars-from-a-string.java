class Solution {
    public String removeStars(String s) {
        Stack<Character> stack = new Stack<>();
        String result = "";

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '*') {
                stack.pop();
            }
            else {
                stack.push(s.charAt(i));
            }
        }

        while(!stack.isEmpty()) result = stack.pop() + result;

        return result;
    }
}