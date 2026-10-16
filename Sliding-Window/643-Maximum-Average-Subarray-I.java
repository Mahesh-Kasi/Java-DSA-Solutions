class Solution {
    public double findMaxAverage(int[] arr, int k) {
        int sum = 0;
        for(int i=0;i<k;i++)
            sum += arr[i];
        int max_sum = sum;
        double average = (double)sum/k;
        int left = 0;
        int right = k-1;
        int n = arr.length;
        while(right < n-1){
            sum -= arr[left];
            left++;
            right++;
            sum += arr[right];
            if(sum > max_sum){
                max_sum = sum;
                average = (double)max_sum/k;
            }
        }
        return average;
    }
}