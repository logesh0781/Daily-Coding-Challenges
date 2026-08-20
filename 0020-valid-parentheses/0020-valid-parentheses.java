class Solution {
    public boolean isValid(String s) {
        if(s.length()==1) return false;
        Stack<Character> a=new Stack<>();
        char[] ca=s.toCharArray();
        for(int i=0;i<s.length();i++){
            char c=ca[i];
            if(c=='(' || c=='[' || c=='{')
                a.push(c);
            else{
                if(a.isEmpty()) return false;
                char p=a.pop();
                if((c==')' && p!='(' )|| (c=='}' && p!='{')|| (c==']' && p!='['))
                    return false;
            }
        }
        if(a.isEmpty()) return true;
        return false;
    }
}