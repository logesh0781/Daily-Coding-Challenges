class Solution {
    public int trap(int[] height) {
        int leftMax=height[0];
        int rightMax=height[height.length-1];
        int leftP=1;
        int rightP=height.length-2;
        int r=0;
        while(leftP<=rightP){
            if(leftMax<rightMax){
                r+=(leftMax- height[leftP]>0)?leftMax- height[leftP]:0;
                leftMax=(leftMax<height[leftP])? height[leftP]:leftMax;
                leftP++;
            }
            else{
                r+=(rightMax- height[rightP]>0)?rightMax- height[rightP]:0;
                rightMax=(rightMax<height[rightP])? height[rightP]:rightMax;
                rightP--;
            }
        }
        return r;
    }
}