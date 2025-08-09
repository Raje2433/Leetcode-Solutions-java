class Solution {
    public void reverseString(char[] s) {
        reverse(s);
    }
    void reverse(char[] str){
        int start=0;
        int end=str.length-1;
        while(start<end){
            char temp=str[start];
            str[start]=str[end];
            str[end]=temp;
            start++;
            end--;
        }
    }
}