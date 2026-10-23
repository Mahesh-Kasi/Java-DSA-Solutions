/*
Platform: LeetCode
Difficulty: Medium
Time Complexity: O(n)
Space Complexity: O(n)
*/

class Solution {
    public int[] queryResults(int limit, int[][] queries) {
        int distinct_colors = 0;
        int result[] = new int[queries.length];
        HashMap<Integer,Integer> ballcolor = new HashMap<>();
        HashMap<Integer,Integer> colorfreq = new HashMap<>();
        for(int i=0;i<queries.length;i++){
            int ball = queries[i][0];
            int color = queries[i][1];
            if(ballcolor.containsKey(ball)){
                int oldcolor = ballcolor.get(ball);
                colorfreq.put(oldcolor,colorfreq.get(oldcolor)-1);
                if(colorfreq.get(oldcolor)==0)  
                    distinct_colors--;
            }
            if(!colorfreq.containsKey(color)||colorfreq.get(color)==0){
                distinct_colors++;
            }
            ballcolor.put(ball,color);
            colorfreq.put(color,colorfreq.getOrDefault(color,0)+1);
            result[i] = distinct_colors;
        }
        return result;
    }
}