/*
Platform: LeetCode
Difficulty: Medium
Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int left = 0;
        int current_length = 0;
        int max_length = 0;
        for(int right=0;right<s.length();right++){
            char ch = s.charAt(right);
            while(map.containsKey(ch)){
                char char_left = s.charAt(left);
                map.put(char_left,map.get(char_left)-1);
                if(map.get(char_left)==0)
                    map.remove(char_left);
                left++;
            }
            map.put(ch,map.getOrDefault(ch,0)+1);
            current_length = right-left+1;
            if(current_length > max_length)
                max_length = current_length;
        }
        return max_length;
    }
}