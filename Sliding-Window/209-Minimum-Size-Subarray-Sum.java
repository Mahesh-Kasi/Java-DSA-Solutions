/*
Platform: LeetCode
Difficulty: Medium
Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public int minSubArrayLen(int target, int[] arr) {
        int n = arr.length;
		int sum = 0;
		int current_length = 0;
		int min_length = Integer.MAX_VALUE;
		int left = 0;
		for(int right=0;right<n;right++){
		    sum += arr[right];
		    while(sum>=target){
                current_length = right-left+1;
                if(min_length > current_length)
		            min_length = current_length;
		        sum -= arr[left];
		        left++;
		    } 
        }
        return min_length == Integer.MAX_VALUE ? 0 : min_length;
    }
}