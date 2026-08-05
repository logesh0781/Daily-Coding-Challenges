class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap <Character,Integer> f=new HashMap<>();
        char[] sc=s.toCharArray();
        char[] tc=t.toCharArray();
        for(char a:sc){
            f.put(a,f.getOrDefault(a,0)+1);
        }
        for(char a:tc){
            f.put(a,f.getOrDefault(a,0)-1);
        }
        for(int i:f.values()){
            if(i!=0) return false;
        }
        return true;
    }
}