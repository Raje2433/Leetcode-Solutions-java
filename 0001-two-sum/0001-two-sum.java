class Solution {
    public int[] twoSum(int[] nums, int target) {
        //using nested loop to find the target
        for(int i=0;i<nums.length;i++){
            int e=target-nums[i];
            int index=search(nums,i+1,nums.length,e);
            if(index!=-1){
                return new int[]{i,index};
            }
        }
        return new int[]{-1,-1};
        
    }
    public int search(int[] a,int start,int end,int element){
        for(int i=start;i<end;i++){
            if(a[i]==element){
                return i;
            }
        }
        return -1;
    }
}