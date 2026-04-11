

public class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);  // Push opening brackets onto the stack
            } else {
                if (stack.isEmpty()) return false;  // No opening bracket to match
                char top = stack.pop();
                
                if ((c == ')' && top != '(') || 
                    (c == '}' && top != '{') || 
                    (c == ']' && top != '[')) {
                    return false;  // Mismatched pair
                }
            }
        }
        
        return stack.isEmpty();  // Stack should be empty if all brackets are matched
    }
}
