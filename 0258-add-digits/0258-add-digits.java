class Solution {
    public int addDigits(int num) {
        int n=num;
        int sum=0;
        int count=0;
        if(num==0){
            return 0;
        }
        while(count!=1){
        count=0;
        while(n>0){
            sum+=(n%10);
            n/=10;
            count++;
        }
        n=sum;
        sum=0;
        }
    return n;
    }
}