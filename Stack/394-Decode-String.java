/*
Platform: LeetCode
Difficulty: Medium
Time Complexity: O(n + m)
Space Complexity: O(n + m)
*/

class Solution {
    public String decodeString(String str) {
        Stack<String> stringStack = new Stack<>();
		Stack<Integer> integerStack = new Stack<>();
		int n = str.length();
		int num = 0;
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<str.length();i++){
			char ch = str.charAt(i);
			if(Character.isDigit(ch)){
				int digit = ch-'0';
				num = num*10+digit;
			}
			else if(ch == '['){
				integerStack.push(num);
				stringStack.push(sb.toString());
				num = 0;
				sb.setLength(0);
			}
			else if(ch == ']'){
				int range = integerStack.pop();
				String previous = stringStack.pop();
				String current = sb.toString();
				sb.setLength(0);
				sb.append(previous);
				for(int j=0;j<range;j++)
					sb.append(current);
			}
			else
				sb.append(ch);
		}
		return sb.toString();
    }
}