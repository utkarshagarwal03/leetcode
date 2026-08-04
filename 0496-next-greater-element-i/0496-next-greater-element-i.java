class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums2.length;i++){
            hm.put(nums2[i],-1);
            for(int j=i+1;j<nums2.length;j++){
                if(nums2[i]<nums2[j]){
                    hm.put(nums2[i],nums2[j]);
                    break;
                }
            }
    }
        for(int i=0;i<nums1.length;i++){
            nums1[i]=hm.get(nums1[i]);
        }
        return nums1;
    }
}