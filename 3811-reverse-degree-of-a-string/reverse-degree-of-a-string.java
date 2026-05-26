class Solution {
    public int reverseDegree(String s) {
        int degree=0;
        for(int i=0; i<s.length(); i++){
            char c=s.charAt(i);
            int reverse=26-(c-'a');
            int pos=i+1;
            degree+=reverse*pos;
        }
        return degree;
    }
}