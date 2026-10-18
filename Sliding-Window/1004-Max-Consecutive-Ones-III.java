/*
Platform: LeetCode
Difficulty: Medium
Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length;
        int left = 0;
        int maxlength = 0;
        int currentlength = 0;
        int zerocount = 0;
        for(int right=0;right<n;right++){
            int element = nums[right];
            if(element == 0)
                zerocount++;
            while(zerocount > k){
                if(nums[left] == 0){
                    zerocount--;
                }
                left++;
            }
            currentlength = right-left+1;
            if(currentlength > maxlength)
                maxlength = currentlength;
        }
        return maxlength;
    }
}