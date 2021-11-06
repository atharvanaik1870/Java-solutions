class Solution {
    public int mySqrt(int x) {
        //return (int)Math.sqrt(x); -- one line solution
        //binary search approach
        int start =1;
        int end = x/2;
        if(x==1)
            return 1;
        if(x == 0)
            return 0;
        while(start<=end)
        {
            int mid= start +(end - start)/2;
            
            if((long)mid*mid == x)
                return mid;
            else if((long)mid*mid>x)
                end=mid-1;
            else
                start=mid+1;
        }
        return end;
    }
}
