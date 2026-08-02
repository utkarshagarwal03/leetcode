class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int max=0;
        for(int i=0;i<piles.length;i++){
            max=Math.max(max,piles[i]);
        }
        int high=max;
        while(low<=high){
            int mid=low+(high-low)/2;
            long sum=0;
            for(int i=0;i<piles.length;i++){
                if(piles[i]<=mid){
                    sum+=1;
                }
                else if(piles[i]%mid==0){
                    sum+=(long)(piles[i]/mid);
                }
                else{
                    sum+=(long)(piles[i]/mid+1);
                }
            }
            if(sum<=h){
                high=mid-1;
            }
            else{
                low=mid+1;
            }

        }
        return low;
    }
}