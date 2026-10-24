/*
Platform: Practice
Difficulty: Easy
Time Complexity: O(n)
Space Complexity: O(1)

Sample Input:
abc12xyz45pq7

Sample Output:
Max : 45
Min : 7
*/

import java.util.Scanner;
class MinMaxInString{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string : ");
		String str = sc.next();
		int num = 0;
		boolean flag = false;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for(int i=0;i<str.length();i++){
			char ch = str.charAt(i);
			if(Character.isDigit(ch)){
				int digit = ch-'0';
				num = num*10+digit;
				flag = true;
			}
			else{
				if(flag){
					if(num > max){
						max = num;
					}
					if(num < min){
						min = num;
					}
				}
				num = 0;
				flag = false;
			}
		}
		if(num > max)
			max = num;
		if(num < min)
			min = num;
		System.out.println("Max : "+max);
		System.out.println("Min : "+min);
	}
}