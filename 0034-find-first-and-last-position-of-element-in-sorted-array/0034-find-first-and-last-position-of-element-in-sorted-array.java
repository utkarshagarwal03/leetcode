class Solution {
    public static int binarysearch(int[] nums,int target,boolean type){
        int low=0;
        int high=nums.length-1;
        int ans=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target){  
                ans=mid;
                if(type)
                high=mid-1;
                else low=mid+1;
            }
            else if(nums[mid]>target){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
    public int[] searchRange(int[] nums, int target) {
        int a=binarysearch(nums,target,true);
        int b=binarysearch(nums,target,false);
        return new int[]{a,b};

    }
}