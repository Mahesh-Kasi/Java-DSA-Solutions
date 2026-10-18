/*
Platform: LeetCode
Difficulty: Medium
Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public boolean checkInclusion(String str1, String str2) {
        if(str1.length()>str2.length())
            return false;
        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();
        for(int i=0;i<str1.length();i++){
            char ch = str1.charAt(i);
            map1.put(ch,map1.getOrDefault(ch,0)+1);
        }
		int k = str1.length();
		int n = str2.length();
		int left = 0;
		int right = k-1;
		for(int i=0;i<k;i++){
			char ch = str2.charAt(i);
			map2.put(ch,map2.getOrDefault(ch,0)+1);
		}
		if(map1.equals(map2)){
			return true;
		}
		while(right < n-1){
			char ch = str2.charAt(left);
			map2.put(ch,map2.get(ch)-1);
			if(map2.get(ch)==0)
				map2.remove(ch);
			left++;
			right++;
			char next = str2.charAt(right);
			map2.put(next,map2.getOrDefault(next,0)+1);
			if(map1.equals(map2)){
				return true;
			}
		}
        return false;
    }
}