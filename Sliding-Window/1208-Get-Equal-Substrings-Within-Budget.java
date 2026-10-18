/*
Platform: LeetCode
Difficulty: Medium
Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int current_length = 0;
        int max_length = 0;
        int n = s.length();
        int current_cost = 0;
        int left = 0;
        for(int right = 0;right<n;right++){
            current_cost += Math.abs(s.charAt(right)-t.charAt(right));
            while(current_cost>maxCost){
                int temp = Math.abs(t.charAt(left)-s.charAt(left));
                current_cost -= temp;
                left++;
            }
            current_length = right-left+1;
            if(max_length < current_length){
                max_length = current_length;
            }
        }
        return max_length;
    }
}