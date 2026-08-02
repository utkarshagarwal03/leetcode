class Solution {
    public int daysneeded(int[] weights,int capacity){
        int days=1;
        int sum=0;
        for(int i=0;i<weights.length;i++){
            if(sum+weights[i]<=capacity){
                sum+=weights[i];
            }
            else{
                days++;
                sum=weights[i];
            }
        }
        return days;
    }
    public int shipWithinDays(int[] weights, int days) {
        long sum=0;
        int max=0;
        for(int i=0;i<weights.length;i++){
            max=Math.max(max,weights[i]);
            sum+=weights[i];
        }
        int low=max;
        long high=sum;
        while(low<=high){
            int mid=low+(int)((high-low))/2;
            int daysneed=daysneeded(weights,mid);
            if(daysneed<=days){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
            }
            return low;
        }
        
    }
