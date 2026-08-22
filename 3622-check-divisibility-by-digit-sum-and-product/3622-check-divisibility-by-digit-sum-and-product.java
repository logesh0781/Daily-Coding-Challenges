class Solution {
    public boolean checkDivisibility(int n) {
        int dsum=0,dp=1;
        int t=n;
        while(t!=0){
            int a=t%10;
            dsum+=a;
            dp*=a;
            t/=10;
        }
        int s=dsum+dp;
        if(n%s==0) return true;
        return false;
    }
}