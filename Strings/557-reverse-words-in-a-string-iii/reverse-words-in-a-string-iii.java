class Solution {
    public String reverseWords(String s) {
        String[] array=s.split(" ");
        StringBuilder result=new StringBuilder();
        for(String var:array){
            StringBuilder s1=new StringBuilder(var);
            s1.reverse();
            result.append(s1).append(" ");
        }
        return result.toString().trim();
    }
}