class MinStack {
 Stack<Integer> s=new Stack<>();
 Stack<Integer> mins=new Stack<>();
    public MinStack() {
    }
    
    public void push(int value) {
        if(mins.isEmpty())
        mins.push(value);
        else if(value>mins.peek()){
            mins.push(mins.peek());
        }
        else{
            mins.push(value);
        }
        s.push(value);

    }
    
    public void pop() {
        mins.pop();
        s.pop();
    }
    
    public int top() {
        int num=s.peek();
        return num;
    }
    
    public int getMin() {
        int min=mins.peek();
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */