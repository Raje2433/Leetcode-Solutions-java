class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max=maximum(candies);
        List<Boolean> b=new ArrayList<>();
        for(int i=0;i<candies.length;i++){
            if(candies[i]+extraCandies>=max){
                b.add(true);
            }
            else{
                b.add(false);
            }
        }
        return b;
    }
    public int maximum(int[] c){
        int m=c[0];
        for(int i=0;i<c.length;i++){
            if(c[i]>m){
                m=c[i];
            }
        }
        return m;
    }
}