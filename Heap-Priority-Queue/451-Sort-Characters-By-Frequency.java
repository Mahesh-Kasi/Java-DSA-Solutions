/*
Platform: LeetCode
Difficulty: Medium
Time Complexity: O(n log n)
Space Complexity: O(n)
*/

class Solution {
    public String frequencySort(String s) {
        HashMap<Character , Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        PriorityQueue<Map.Entry<Character , Integer>>pq = new PriorityQueue<>((a,b) -> b.getValue() - a.getValue());
        pq.addAll(map.entrySet());
        String res = "";
        while(!pq.isEmpty()){
            Map.Entry<Character , Integer> entry = pq.poll();
            for(int i=0;i<entry.getValue();i++)
                res += entry.getKey();
        }
        return res;
    }
}