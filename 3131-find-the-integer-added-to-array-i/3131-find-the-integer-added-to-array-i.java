class Solution {
    public int addedInteger(int[] nums1, int[] nums2) {
        int m1=nums1[0],m2=nums2[0];

        for(int i:nums1)
            m1=m1>i?i:m1;
        for(int i:nums2)
            m2=m2>i?i:m2;

        return m2-m1;
    }
}