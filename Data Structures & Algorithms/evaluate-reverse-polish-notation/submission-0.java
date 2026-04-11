class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        
        for (String token : tokens) {
            if (token.equals("+")) {
                int elem2 = stack.pop();
                int elem1 = stack.pop();
                stack.push(elem1 + elem2);
            } else if (token.equals("-")) {  // Fixed `elseif` to `else if`
                int elem2 = stack.pop();
                int elem1 = stack.pop();
                stack.push(elem1 - elem2);
            } else if (token.equals("*")) {  // Fixed `elseif` to `else if`
                int elem2 = stack.pop();
                int elem1 = stack.pop();
                stack.push(elem1 * elem2);
            } else if (token.equals("/")) {  // Fixed `elseif` to `else if`
                int elem2 = stack.pop();
                int elem1 = stack.pop();
                stack.push(elem1 / elem2);
            } else {
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();  // Return the final computed value
    }
}