class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        ArrayList<Integer> l1=new ArrayList<>();
        HashSet<Integer> s1=new HashSet<>();

        for (int i:nums1) {
            s1.add(i);
        }

        for (int i:nums2) {
            if (s1.contains(i)) {
                s1.remove(i);
                l1.add(i);
            }
        }

        int[] a=new int[l1.size()];
        int i = 0;

        for (int j:l1) {
            a[i++]=j;
        }

        return a;
    }
}