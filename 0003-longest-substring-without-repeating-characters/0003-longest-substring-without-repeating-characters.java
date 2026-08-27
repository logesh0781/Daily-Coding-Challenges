class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l=0,r=0,ml=0;
        HashSet<Character> set=new HashSet<>();
        for(r=0;r<s.length();r++){
            char c=s.charAt(r);
            if(set.contains(c)){
                while(set.contains(c)){
                    set.remove(s.charAt(l));
                    l++;
                }
                set.add(c);
            }
            else{
                set.add(c);
                ml=Math.max(ml,r-l+1);
            }
        }
        return ml;
    }
}