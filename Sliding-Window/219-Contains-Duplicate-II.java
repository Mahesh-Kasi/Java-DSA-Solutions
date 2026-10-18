/*
Platform: LeetCode
Difficulty: Medium
Time Complexity: O(n)
Space Complexity: O(n)
*/

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int element = nums[i];
            if(map.containsKey(element)){
                if(Math.abs(map.get(element)-i)<=k)
                    return true;
                map.put(element,i);
            }
            else
                map.put(element,i);
        }
        return false;
    }
}