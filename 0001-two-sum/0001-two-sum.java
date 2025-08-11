class Solution {
    public int[] twoSum(int[] nums, int target) {
        //using nested loop to find the target
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};//return indices of the sum pairs
                }
            }
        }
        return new int[]{-1,-1}; // if no such pair exist
    }
}