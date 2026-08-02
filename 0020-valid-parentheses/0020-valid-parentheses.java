class Solution {
    public boolean isValid(String s) {
        Stack<Character> sc=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='{'|| s.charAt(i)=='['){
                sc.push(s.charAt(i));
            }
            
            else if(sc.isEmpty()){
                return false;
            }
            else if(sc.peek()=='(' && s.charAt(i)==')'){
                sc.pop();
            }
            else if(sc.peek()=='{' && s.charAt(i)=='}'){
                sc.pop();
            }
            else if(sc.peek()=='[' && s.charAt(i)==']'){
                sc.pop();
            }else sc.push(s.charAt(i));
            
        }
        if(sc.isEmpty()){
                return true;
            }
            else return false;

    }
}