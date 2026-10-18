/*
Platform: LeetCode
Difficulty: Medium
Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public List<Integer> findAnagrams(String str1, String str2) {
        if(str2.length()>str1.length())
            return new ArrayList<>();
        int k = str2.length();
        HashMap<Character,Integer> map1 = new HashMap<>();
		for(int i=0;i<k;i++){
			char ch = str2.charAt(i);
			map1.put(ch,map1.getOrDefault(ch,0)+1);
		}
		int left = 0;
		int right = k-1;
		HashMap<Character,Integer> map2 = new HashMap<>(); 
		for(int i=0;i<k;i++){
			char ch = str1.charAt(i);
			map2.put(ch,map2.getOrDefault(ch,0)+1);
		}
		List<Integer> result = new ArrayList<>();
		if(map1.equals(map2)){
			result.add(left);
		}
		while(right < str1.length()-1){
			char ch = str1.charAt(left);
			map2.put(ch,map2.get(ch)-1);
			if(map2.get(ch)==0)
				map2.remove(ch);
			left++;
			right++;
			char next = str1.charAt(right);
			map2.put(next,map2.getOrDefault(next,0)+1);
			if(map1.equals(map2))
				result.add(left);
		}
        return result;
    }
}