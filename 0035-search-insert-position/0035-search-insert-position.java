class Solution {
    public int searchInsert(int[] nums, int target) {
       if(nums[nums.length-1]<target){
            return nums.length;
        }
        int index=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=target){
                index=i;
                break;
            }
        }
        return index;
    }
}