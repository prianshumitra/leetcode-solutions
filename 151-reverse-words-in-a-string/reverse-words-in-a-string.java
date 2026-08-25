class Solution {
    public String reverseWords(String s) {
        Stack<String> stack = new Stack<>();
        String str = "";
        for(int i=0; i < s.length(); i++) {
            
            if(s.charAt(i) == ' ') {

                if(!str.equals("")) {
                    stack.push(str);
                    str = "";
                }
            } 
            else {
                str = str + s.charAt(i);
            }
        }
        if(!str.equals("")) {
            stack.push(str);
        }

        String rev = stack.pop();
        while(!stack.isEmpty()) {
            rev = rev+" "+stack.pop();
        }
        return rev;
    }
}