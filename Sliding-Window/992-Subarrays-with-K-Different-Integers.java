/*
Platform: LeetCode
Difficulty: Hard
Time Complexity: O(n)
Space Complexity: O(k)
*/

class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        int result = atMost(nums,k)-atMost(nums,k-1);
        return result;
    }
    public static int atMost(int[] arr,int k){
        int n = arr.length;
        int left = 0;
        int length = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int right = 0;right<n;right++){
            int element = arr[right];
            map.put(element,map.getOrDefault(element,0)+1);
            while(map.size()>k){
                map.put(arr[left],map.get(arr[left])-1);
                if(map.get(arr[left])==0)
                    map.remove(arr[left]);
                left++;
            }
            length += right-left+1;
        }
        return length;
    }
}