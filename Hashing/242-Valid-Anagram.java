/*
Platform: LeetCode
Difficulty: Easy
Time Complexity: O(n)
Space Complexity: O(n)
*/

class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Integer>hm = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);
            hm.put(ch1,hm.getOrDefault(ch1,0)+1);
            hm.put(ch2,hm.getOrDefault(ch2,0)-1);
        }
        for(int x:hm.values()){
            if(x!=0){
                return false;
            }
        }
        return true;
    }
}