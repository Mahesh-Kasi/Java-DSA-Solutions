/*
Platform: LeetCode
Difficulty: Medium
Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int res = atMost(nums,k)-atMost(nums,k-1);
        return res;
    }
    public static int atMost(int[] arr,int k){
        int left = 0;
        int n = arr.length;
        int odd_count = 0;
        int length = 0;
        for(int right=0;right<n;right++){
            if((arr[right]%2)!=0){
                odd_count++;
            }
            while(odd_count>k){
                if((arr[left]%2)!=0)
                    odd_count--;
                left++;
            }
            length += right-left+1;
        }
        return length;
    }
}