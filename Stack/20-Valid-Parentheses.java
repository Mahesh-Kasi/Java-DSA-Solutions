/*
Platform: LeetCode
Difficulty: Easy
Time Complexity: O(n)
Space Complexity: O(n)
*/

import java.util.Stack;
import java.util.HashMap;
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        HashMap<Character , Character> map = new HashMap<>();
        map.put(')','(');
        map.put(']','[');
        map.put('}','{');
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch==')'||ch==']'||ch=='}'){
                if(stack.isEmpty())
                    return false;
                if(stack.peek()!=map.get(ch))
                    return false;
                stack.pop();
            }
            else
                stack.push(ch);
        }
        return stack.isEmpty();
    }
}