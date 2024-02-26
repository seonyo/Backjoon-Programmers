import java.util.*;
class Solution{
    public int solution(String s){
        Stack<Character> stack = new Stack<>();
        
        for(int i=0; i<s.length(); i++){
            if(!stack.empty() && stack.peek().equals(s.charAt(i))){
                stack.pop();
            } else {
                stack.push(s.charAt(i));
            }
        }
        
        return stack.empty() ? 1 : 0;
    }
}