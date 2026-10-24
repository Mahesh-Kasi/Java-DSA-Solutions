/*
Platform: LeetCode
Difficulty: Medium
Time Complexity: O(n)
Space Complexity: O(n)
*/

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> result = new ArrayList<>();
        LinkedHashMap<Integer , Integer> map = new LinkedHashMap<>();
        for(int x : nums){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        Set<Integer> keys = map.keySet();
        for(int x : keys){
            int frequency = map.get(x);
            if(frequency > (nums.length/3))
                result.add(x);
        }
        return result;
    }
}