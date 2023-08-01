class Solution {
    public String removeKdigits(String num, int k) {
        if (num == null || num.length() <= k) {
            return "0"; 
        }

        Stack<Character> stack = new Stack<>();
        int digitsToRemove = k;

        for (char c : num.toCharArray()) {
            
            while (digitsToRemove > 0 && !stack.isEmpty() && c < stack.peek()) {
                stack.pop(); 
                digitsToRemove--;
            }

            stack.push(c); 
        }

       
        while (digitsToRemove > 0 && !stack.isEmpty()) {
            stack.pop();
            digitsToRemove--;
        }

        
        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.insert(0, stack.pop());
        }

     
        while (result.length() > 1 && result.charAt(0) == '0') {
            result.deleteCharAt(0);
        }

        return result.toString();
    }

    
}
