/*
Platform: LeetCode
Difficulty: Medium
Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public int totalFruit(int[] fruits) {
        int n = fruits.length;
        int left = 0;
        int currentlength = 0;
        int maxlength = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int right=0;right<n;right++){
            int element = fruits[right];
            map.put(element,map.getOrDefault(element,0)+1);
            while(map.size()>2){
                map.put(fruits[left],map.get(fruits[left])-1);
                if(map.get(fruits[left])==0)    
                    map.remove(fruits[left]);
                left++;
            }
            currentlength = right-left+1;
            if(maxlength < currentlength)
                maxlength = currentlength;
        }
        return maxlength;
    }
}