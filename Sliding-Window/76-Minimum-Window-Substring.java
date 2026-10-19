/*
Platform: LeetCode
Difficulty: Hard
Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character,Integer> map = new HashMap<>();
		int m = t.length();
		int n = s.length();
		for(int i=0;i<m;i++)
		    map.put(t.charAt(i),map.getOrDefault(t.charAt(i),0)+1);
		int count = 0;
		int startIndex = 0;
		int min_length = Integer.MAX_VALUE;
		int left = 0;
		int right =0;
		while(right < n){
		    if(map.containsKey(s.charAt(right))){
		        if(map.get(s.charAt(right))>0){
		            count++;
		            map.put(s.charAt(right),map.get(s.charAt(right))-1);
		        }
		        else{
		            map.put(s.charAt(right),map.get(s.charAt(right))-1);
		        }
		    }
		    else{
		        map.put(s.charAt(right),-1);
		    }
		    while(count==m){
		        if (right-left+1 < min_length) {
                    min_length = right-left+1;
                    startIndex = left;
                }
		        map.put(s.charAt(left),map.get(s.charAt(left))+1);
		        if(map.get(s.charAt(left))>0)
		            count--;
		        left++;
		    }
		    right += 1;
		}
		if(min_length==Integer.MAX_VALUE)
		    return "";
		else{
		    return s.substring(startIndex,startIndex+min_length);
		}
    }
}