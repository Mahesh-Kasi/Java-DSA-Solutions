/*
Platform: LeetCode
Difficulty: Easy
Time Complexity: O(n)
Space Complexity: O(n)
*/

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        result[0] = -1;
        result[1] = -1;
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int element = nums[i];
            int required = target - element;
            if(map.containsKey(required)){
                result[0] = map.get(required);
                result[1] = i;
                return result;
            }
            map.put(nums[i],i);
        }
        return result;
    }
}