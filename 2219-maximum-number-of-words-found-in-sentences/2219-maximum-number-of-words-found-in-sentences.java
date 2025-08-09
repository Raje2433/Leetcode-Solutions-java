class Solution {
    public int mostWordsFound(String[] sentences) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<sentences.length;i++){
            String[] a=sentences[i].split(" ");
            int len=a.length;
            if(len>max){
                max=len;
            }
        }
        return max;
    }
}