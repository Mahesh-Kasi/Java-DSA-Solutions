/*
Platform: LeetCode
Difficulty: Medium
Time Complexity: O(n * k log k)
Space Complexity: O(n * k)
*/

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String , ArrayList<String>> map = new HashMap<>();
        for(int i=0;i<strs.length;i++){
            String word = strs[i];
            char[] arr = word.toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);
            if(map.containsKey(key)){
                map.get(key).add(word);
            }
            else{
                map.put(key,new ArrayList<String>());
                map.get(key).add(word);
            }
        }
        List<List<String>> result = new ArrayList<>(); 
        Set<String> keys = map.keySet();
        for(String x:keys){
            result.add(map.get(x));
        }
        return result;
    }
}
