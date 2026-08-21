import java.util.Arrays;

class Solution {
    public String maximumOddBinaryNumber(String s) {
        char[] c = s.toCharArray();
        String r="";
        int z=0,o=0;
        for(int i:c){
            if(i=='0') z++;
            else o++;
        }
        while(z!=0 || o!=1){
            if(o!=1) {
                r=r+'1';
                o--; }
            else{
                r=r+'0';
                z--;
            }
        }
        r=r+'1';
        return r;
    }
}
