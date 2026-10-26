/*
Platform: LeetCode
Difficulty: Easy
Time Complexity: O(n)
Space Complexity: O(n)
*/

import java.util.Arrays;
import java.util.HashSet;
class Solution {
    public int minimumOperations(int[] nums) {
        if(Arrays.stream(nums).allMatch(x -> x == 0))
            return 0;
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            int element = nums[i];
            if(element!=0)
                set.add(element);
        }
        return set.size();
    }
}
