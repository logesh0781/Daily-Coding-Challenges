class Solution {
    public String longestCommonPrefix(String[] strs) {
        String str="";
        Arrays.sort(strs);
        String f=strs[0];
        String l=strs[strs.length-1];
        for(int i=0;i<f.length();i++){
            if(f.charAt(i)!=l.charAt(i)) break;
            str+=f.charAt(i);
        }
        return str;
    }
}