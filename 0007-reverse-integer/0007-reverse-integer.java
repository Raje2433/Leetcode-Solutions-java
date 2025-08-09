class Solution {
    public int reverse(int x) {
        int num=0;
        while(x!=0){
            if (num > 214748364 || (num == 214748364 && x%10 > 7))
                return 0;  // too big, will overflow
            if (num < -214748364 || (num == -214748364 && x%10 < -8))
                return 0;
            num=(num*10)+(x%10);
            x/=10;
        }
        return num;
    }
}