class Solution {
    public int differenceOfSum(int[] nums) {
        int elementSum=0;
        int digitSum=digit(nums);
        for(int i=0;i<nums.length;i++){
            elementSum+=nums[i];
        }
        int answer=elementSum-digitSum;
        if(answer<0){
            return answer*-1;
        }
        return answer;
    }
    public int digit(int[] n){
        int dsum=0;
        for(int i=0;i<n.length;i++){
            int num=n[i];
            int sum=0;
        while(num>0){
            sum+=(num%10);
            num/=10;
        }
        dsum+=sum;
        }
        return dsum;
    }
}