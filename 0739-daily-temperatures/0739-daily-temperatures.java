class Solution {
    public int[] dailyTemperatures(int[] t) {
        int n=t.length;
        int[] arr=new int[n];
        Stack<Integer> s=new Stack<>();
        s.push(0);
        for(int i=1;i<n;i++){
            while(!s.isEmpty() && t[s.peek()]<t[i]){
                arr[s.peek()]=i-s.peek();
                s.pop();
            }
             s.push(i);
            
        }
        arr[n-1]=0;
        return arr;
    }
}