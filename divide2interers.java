class Solution {
    public int divide(int A, int B) {
        int ans = 0;
        if (B == -2147483648) return A == B ? 1 : 0;
        if (A == -2147483648) {
            if (B == 1) return -2147483648;
            if (B == -1) return 2147483647;
            A += Math.abs(B);
            ans++;
        }
        ans += Math.floor(Math.exp(Math.log(Math.abs(A)) - Math.log(Math.abs(B))));
        return A > 0 == B > 0 ? ans : -ans;
    }
}
//approach 2 (fails for 1 edge case)
class Solution {
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE;
        double divi=Math.abs((double)dividend);
        double divs=Math.abs((double)divisor);
        int ans= Math.log(divi)- Math.log(divs);
        double ans1=Math.pow(2.718281828,ans);
        if(divisor < 0 && dividend <0)
            return (int)ans1;
        if(divisor < 0 || dividend <0)
            ans1=ans1 * (-1);
        return (int)ans1;
    }
}
