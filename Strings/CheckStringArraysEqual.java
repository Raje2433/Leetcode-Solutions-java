// ✅ Problem: Check If Two String Arrays are Equivalent
// 🔗 Link: https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/
class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String s1=concad(word1);
        String s2=concad(word2);
        if(s1.equals(s2)){
            return true;
        }
        return false;
    }
    String concad(String[] w){
        StringBuilder str=new StringBuilder();
        for(String var:w){
            str.append(var);
        }
        return str.toString();
    }
}