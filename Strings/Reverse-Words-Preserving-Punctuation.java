/*
Platform: Practice
Difficulty: Medium
Time Complexity: O(n)
Space Complexity: O(n)
*/

import java.util.Scanner;
import java.util.Stack;
class PreservingPunctuations{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string : ");
		String str = sc.nextLine();
		Stack<String> stack = new Stack<>();
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<str.length();i++){
			char ch = str.charAt(i);
			if(Character.isLetter(ch)){
				sb.append(ch);
			}
			else{
				if(sb.length()>0){
					stack.push(sb.toString());
					sb.setLength(0);
				}
			}
		}
		if(sb.length()>0){
			stack.push(sb.toString());
			sb.setLength(0);
		}
		for(int i=0;i<str.length();i++){
			char ch = str.charAt(i);
			if(Character.isLetter(ch)){
				sb.append(stack.pop());
				while((i+1)<str.length()&&Character.isLetter(str.charAt(i+1))){
					i++;
				}
			}
			else{
				sb.append(ch);
			}
		}
		System.out.println(sb);
	}
}

/*
Example:

Input:
Hello, World!

Output:
World, Hello!
*/
