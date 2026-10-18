/*
Platform: LeetCode
Difficulty: Medium
Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public int maxVowels(String str, int k) {
        String vowel = "aeiou";
		int left = 0;
		int right = k-1;
		int sum = 0;
		for(int i=0;i<k;i++){
			char ch = str.charAt(i);
			if(vowel.indexOf(ch)!=-1)
				sum++;
		}
		int max_vowels = sum;
		int n = str.length();
		while(right < n-1){
			if(vowel.indexOf(str.charAt(left))!=-1)
				sum--;
			left++;
			right++;
			if(vowel.indexOf(str.charAt(right))!=-1)
				sum++;
			if(max_vowels < sum)
				max_vowels = sum;
		}
        return max_vowels;
    }
}