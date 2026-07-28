class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int m=0;
        while(left<=right){
            int area=Math.min(height[left],height[right])*(right-left);
            m=Math.max(area,m);
            if(height[left]<height[right]) left++;
            else right--;
        }
        return m;
    }
}