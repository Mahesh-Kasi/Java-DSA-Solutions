/*
Platform: LeetCode
Difficulty: Medium
Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character , Integer> map = new HashMap<>();
        int left = 0;
        int maxfreq = 0;
        int currentlength = 0;
        int maxlength = 0;
        for(int right=0;right<s.length();right++){
            char ch = s.charAt(right);
            map.put(ch,map.getOrDefault(ch,0)+1);
            maxfreq = Math.max(maxfreq,map.get(ch));
            while((right-left+1)-maxfreq > k){
                map.put(s.charAt(left),map.get(s.charAt(left))-1);
                left++;
            }
            currentlength = right-left+1;
            maxlength = Math.max(maxlength,currentlength);
        }
        return maxlength;
    }
}