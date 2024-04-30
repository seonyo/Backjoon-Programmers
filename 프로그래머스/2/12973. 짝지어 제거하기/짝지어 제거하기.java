import java.util.*;
class Solution
{
    public int solution(String s)
    {
        Stack<Character> stack = new Stack<>();
        stack.push(s.charAt(0));
        
        for(int i=1; i<s.length(); i++){
            if(stack.isEmpty())
                stack.push(s.charAt(i));
            else if(stack.peek() != s.charAt(i))
                stack.push(s.charAt(i));
            else
                stack.pop();
        }
        
        return stack.isEmpty() ? 1 : 0;
    }
}