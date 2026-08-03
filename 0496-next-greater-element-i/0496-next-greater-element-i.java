class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] result=new int[nums1.length];
        Stack<Integer> s=new Stack<>();
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int i:nums2){
            while(!s.isEmpty() && i>s.peek()){
                    h.put(s.pop(),i);
                }
            s.push(i);
        }
        while(!s.isEmpty()){
            h.put(s.pop(),-1);
        }
        for(int i=0;i<nums1.length;i++){
            result[i]=h.get(nums1[i]);
        }
        return result;
    }
}