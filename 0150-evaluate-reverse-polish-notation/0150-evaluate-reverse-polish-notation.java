class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<tokens.length;i++){
            if(tokens[i].equals("+")){
                int b=s.pop();
                int a=s.pop();
                int together=a+b;
                s.push(together);
            }
            else if(tokens[i].equals("-")){
                int b=s.pop();
                int a=s.pop();
                int together=a-b;
                s.push(together);
            }
            else if(tokens[i].equals("*")){
                int b=s.pop();
                int a=s.pop();
                int together=a*b;
                s.push(together);
            }
            else if(tokens[i].equals("/")){
                int b=s.pop();
                int a=s.pop();
                int together=a/b;
                s.push(together);
            }
            else{
                int a=Integer.parseInt(tokens[i]);
                s.push(a);
            }
        }
        return s.peek();
    }
}