/*
Platform: LeetCode
Difficulty: Easy
Time Complexity: O(n log n)
Space Complexity: O(n)
*/

class Solution {
    public int mostFrequentEven(int[] nums) {
        TreeMap<Integer , Integer> map = new TreeMap<>();
        for(int x : nums){
            if((x%2)==0)
                map.put(x,map.getOrDefault(x,0)+1);
        }
        Set<Integer> keys = map.keySet();
        int max = 0;
        int element = -1;
        for(int x : keys){
            if(map.get(x) > max){
                max = map.get(x);
                element = x;
            }
        }
        if(element >= 0)
            return element;
        return -1;
    }
}