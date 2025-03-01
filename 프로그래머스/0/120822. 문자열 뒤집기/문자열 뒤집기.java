import java.util.Stack;

class Solution {
    public String solution(String myString) {
        Stack<Character> stack = new Stack<>();
        
        for(char c: myString.toCharArray()){
            stack.push(c);
        }
        
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        
        return sb.toString();
    }
}