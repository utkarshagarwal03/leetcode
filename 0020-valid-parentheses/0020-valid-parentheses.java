class Solution {
    public boolean isValid(String s) {
        Stack<Character> sc=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='{'|| s.charAt(i)=='['){
                sc.push(s.charAt(i));
            }
            else{
                
            if(sc.isEmpty()){
                return false;
            }
            char str=s.charAt(i);
                char top=sc.peek();
            if(top=='(' && str!=')'||top=='{' && str!='}'||top=='[' && str!=']'){
                return false;
            }
            else{
                sc.pop();
            }
            }
        }
        if(sc.isEmpty()){
                return true;
            }
            else return false;

    }
}