/*
Platform: GeeksforGeeks
Difficulty: Easy
Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public static int findSum(String s) {
        int sum = 0;
        int num = 0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(Character.isDigit(ch)){
                int digit = ch-'0';
                num = num*10+digit;
            }
            else{
                sum += num;
                num = 0;
            }
        }
        if(num>0)
            sum += num;
        return sum;
    }
}