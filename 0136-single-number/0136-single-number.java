import java.util.Arrays;
class Solution {
    public int singleNumber(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        Arrays.sort(nums);
        int count=0;
        int ans=-1;
        int target=nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                count++;
            }
            else{
                if(count!=2){
                    ans=target;
                    break;
                }
                else{
                    target=nums[i];
                    count=1;
                }
            }
        }
        if(ans==-1){
            return target;
        }
        return ans;
    }
}