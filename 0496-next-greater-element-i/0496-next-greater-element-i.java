class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<nums2.length;i++){
            hm.put(nums2[i],-1);
            while(!s.isEmpty() && s.peek()<nums2[i]){
                hm.put(s.peek(),nums2[i]);
                s.pop();
            }
            s.push(nums2[i]);
    }
        for(int i=0;i<nums1.length;i++){
            nums1[i]=hm.get(nums1[i]);
        }
        return nums1;
    }
}