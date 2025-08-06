// ✅ Problem: Reverse String
// 🔗 Link: https://leetcode.com/problems/reverse-string/

class Solution {
    public void reverseString(char[] s) {
        reverse(s);
    }

    // method to reverse the array in-place
    void reverse(char[] str) {
        int start = 0;
        int end = str.length - 1;
        while (start < end) {
            char temp = str[start];
            str[start] = str[end];
            str[end] = temp;
            start++;
            end--;
        }
    }
}
