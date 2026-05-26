class Solution {
    public int fib(int n) {
        int a=0, b=1;
        while(n>0){
           int x=a+b;
            a=b;
            b=x;
            n--;
        }
        return a;
    }
}