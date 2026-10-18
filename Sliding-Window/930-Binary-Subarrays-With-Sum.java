/*
Platform: LeetCode
Difficulty: Medium
Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int result = atMost(nums,goal)-atMost(nums,goal-1);
        return result;
    }
    public static int atMost(int arr[],int k){
        if(k<0)
            return 0;
        int n = arr.length;
        int current_sum = 0;
        int left = 0;
        int length = 0;
        for(int right=0;right<n;right++){
            current_sum += arr[right];
            while(current_sum > k){
                current_sum -= arr[left];
                left++;
            }
            length += right-left+1;
        }
        return length;
    }
}