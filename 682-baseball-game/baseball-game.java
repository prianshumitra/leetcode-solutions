class Solution {
    public int calPoints(String[] operations) {
        
        Stack<Integer> stack = new Stack<>();
        int sum = 0;

        for(int i=0; i<operations.length; i++) {
            if(operations[i].equals("C")) {
                stack.pop();
            }
            else if(operations[i].equals("D")) {
                int val = stack.peek()*2;
                stack.push(val);
            }
            else if(operations[i].equals("+")) {
                int val = stack.get(stack.size() - 2)+stack.peek();
                stack.push(val);
            }
            else {
                stack.push(Integer.parseInt(operations[i]));
            }
        }
        while(!stack.isEmpty()) {
            sum = sum+stack.peek();
            stack.pop();
        }
        return sum;
    }
}