class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double average;
        int window_sum=0;
        int max_sum=0;
        for(int i=0;i<k;i++){
            window_sum+=nums[i];
        }
        max_sum=window_sum;
        for(int i=k;i<nums.length;i++){
            window_sum=(window_sum-nums[i-k])+nums[i];
            if(window_sum>max_sum){
                max_sum=window_sum;
            }
        }
        average=(double)max_sum/k;
        return average;
    }
}