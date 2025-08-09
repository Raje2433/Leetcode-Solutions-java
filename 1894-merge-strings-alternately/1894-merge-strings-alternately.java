class Solution {
    public String mergeAlternately(String word1, String word2) {
            StringBuilder s = new StringBuilder();
            int n1=word1.length();
            int n2=word2.length();
            int w1_i=0;
            int w2_i=0;
            while(w1_i<n1 || w2_i<n2){
                if(w1_i<n1){
                    s.append(word1.charAt(w1_i));
                    w1_i++;
                }
                if(w2_i<n2){
                    s.append(word2.charAt(w2_i));
                    w2_i++;
                }
            }
            
            String r=s.toString();
            return r;
    }
}