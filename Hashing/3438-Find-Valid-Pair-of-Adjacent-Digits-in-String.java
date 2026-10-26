/*
Platform: LeetCode
Difficulty: Easy
Time Complexity: O(n)
Space Complexity: O(1)
*/

import java.util.HashMap;
class Solution {
    public String findValidPair(String s) {
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            int ch = s.charAt(i)-'0';
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<s.length()-1;i++){
            int first = s.charAt(i)-'0';
            int second = s.charAt(i+1)-'0';
            if(first!=second)
                if(map.get(first)==first && map.get(second)==second)
                    return s.substring(i,i+2);
        }
        return "";
    }
}