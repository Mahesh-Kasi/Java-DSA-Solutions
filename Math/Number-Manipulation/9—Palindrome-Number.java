/*
Platform: LeetCode
Difficulty: Easy
Time Complexity: O(log n)
Space Complexity: O(1)
*/

class Solution {
    public boolean isPalindrome(int x) {
        int temporary = x;
        int result = 0;
        if(x==0)
            return true;
        while(temporary!=0){
            int digit = temporary%10;
            result = result*10+digit;
            temporary = temporary/10;
        }
        if(result == x && x > 0)
            return true;
        else
            return false;
    }
}