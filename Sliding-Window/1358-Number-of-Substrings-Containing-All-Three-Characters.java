/*
Platform: LeetCode
Difficulty: Medium
Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public int numberOfSubstrings(String str) {
        int[] lastseen = {-1,-1,-1};
        int n = str.length();
        int count = 0;
        for(int i=0;i<n;i++){
            char ch = str.charAt(i);
            lastseen[ch-'a'] = i;
            if(lastseen[0]!=-1&&lastseen[1]!=-1&&lastseen[2]!=-1)
                count += 1+(Math.min(lastseen[0],Math.min(lastseen[1],lastseen[2]))); 
        }
        return count;
    }
}