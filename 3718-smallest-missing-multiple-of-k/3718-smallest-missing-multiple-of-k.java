class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> s=new HashSet<>();
        for(int i:nums) s.add(i);
        int i=1;
        while(true){
            if(!s.contains(i*k)) return i*k;
            i++;
        }
    }
}