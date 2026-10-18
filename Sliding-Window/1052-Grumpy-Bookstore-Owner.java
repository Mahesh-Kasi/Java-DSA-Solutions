/*
Platform: LeetCode
Difficulty: Medium
Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int k) {
        int n = customers.length;
        int left = 0;
		int right = k-1;
		int sum = 0;
		for(int i=0;i<k;i++){
			if(grumpy[i] == 1){
				sum += customers[i];
			}
		}
		int maxsum = sum;
		while(right	< n-1){
			if(grumpy[left] == 1)
				sum -= customers[left];
			left++;
			right++;
			if(grumpy[right] == 1)
				sum += customers[right];
			if(sum > maxsum)
				maxsum = sum;
		}
		int satisfied = 0;
		for(int i=0;i<n;i++){
			if(grumpy[i] == 0)
				satisfied += customers[i];
		}
		satisfied += maxsum;
        return satisfied ;
    }
}