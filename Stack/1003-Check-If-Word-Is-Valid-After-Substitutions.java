/*
Platform: LeetCode
Difficulty: Medium
Time Complexity: O(n)
Space Complexity: O(n)
*/

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == 'c'){
                if(stack.isEmpty()||stack.peek()!='b')
                    return false;
                stack.pop();
                if(stack.isEmpty()||stack.peek()!='a')
                    return false;
                stack.pop();
            }
            else
                stack.push(ch);
        }
        return stack.isEmpty();
    }
}