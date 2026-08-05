class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> s=new Stack<>();
        Stack<Integer> s2=new Stack<>();
        int[] prev=new int[heights.length];
        int[] next=new int[heights.length];
        for(int i=0;i<heights.length;i++){
            
           while(!s.isEmpty() && heights[s.peek()]>=heights[i]){
            s.pop();
           }
           if(s.isEmpty()){
            prev[i]=-1;
           }
           else{
            prev[i]=s.peek();
           }
           s.push(i);
        }
           for(int i=heights.length-1;i>=0;i--){
                while(!s2.isEmpty() && heights[s2.peek()]>=heights[i]){
                    s2.pop();
                }
                if(s2.isEmpty()){
                    next[i]=heights.length;
                }
                else{
                    next[i]=s2.peek();
                }
                s2.push(i);
           }
           int max=0;
           for(int i=0;i<heights.length;i++){
                int width=next[i]-prev[i]-1;
                int ans=heights[i]*width;
                max=Math.max(ans,max);
           }
        
        return max;
    }
}