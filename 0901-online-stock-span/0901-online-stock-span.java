class StockSpanner {
    Stack<int[]> s=new Stack<>();
    public StockSpanner() {
        
    }
    
    public int next(int price) {
            int old=0;
            while(!s.isEmpty() && s.peek()[0]<=price){
                old+=s.peek()[1];
                s.pop();
            }
            s.push(new int[]{price,old+1});
            return s.peek()[1];
        }
        
    }


/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */