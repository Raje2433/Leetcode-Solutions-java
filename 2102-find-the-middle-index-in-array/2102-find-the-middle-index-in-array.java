class Solution {
    public int findMiddleIndex(int[] nums) {
        int[] prefix = new int[nums.length+1];
        if(nums.length==1){
            return 0;
        }
        prefix[0]=0;
        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+nums[i-1];
        }
        for(int j=1;j<prefix.length;j++){
            int left=prefix[j-1];
            int right=prefix[prefix.length-1]-prefix[j];
            if(left==right){
                return j-1;
            }
        }
        return -1;

    }
}