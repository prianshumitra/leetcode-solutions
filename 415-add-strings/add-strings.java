class Solution {
    public String addStrings(String num1, String num2) {
        Stack<Integer> no1 = new Stack<>();
        Stack<Integer> no2 = new Stack<>();
        Stack<Character> result = new Stack<>();

        int max = Math.max(num1.length(),num2.length());

        for(int i=0; i<num1.length(); i++) {
            no1.push(num1.charAt(i)-'0');
        }

        for(int i=0; i<num2.length(); i++) {
            no2.push(num2.charAt(i)-'0');
        }

        int carry = 0;
        int sum = 0;

        for(int i=0; i<max; i++) {
            //if only no1 has digits left
            if(no2.isEmpty()) {
                sum = no1.pop()+carry;
                carry = sum/10;
                sum = sum%10;
                result.push((char)(sum+'0'));
                sum = 0;
            }
            //if only no2 has digits left
            else if(no1.isEmpty()) {
                sum = no2.pop()+carry;
                carry = sum/10;
                sum = sum%10;
                result.push((char)(sum+'0'));
                sum = 0;
            }
            else{
                sum = no1.pop()+no2.pop()+carry;
                carry = sum/10;
                sum = sum%10;
                result.push((char)(sum+'0'));
                sum = 0;
            }
        }
        if (carry != 0) {
            result.push((char)(carry + '0'));
        }
        StringBuilder ans = new StringBuilder();
        while (!result.isEmpty()) {
            ans.append(result.pop());
        }

        return ans.toString();
    }
}