//import java.util.*;
import java.lang.*;
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0 || strs==null)
            return "";
        int minL=Integer.MAX_VALUE;
        for(String str : strs)
            minL=Math.min(minL,str.length());
        int low=1;
        int high=minL;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(isCommonPrefix(strs,mid))
                low=mid+1;
            else
                high=mid-1;
            
        }
        return strs[0].substring(0,(low+high)/2);
    }
    private boolean isCommonPrefix(String[] strs,int len)
    {
        String str1=strs[0].substring(0,len);
        for(int i=1;i<strs.length;i++)
        {
            if(!strs[i].startsWith(str1))
                return false;
            
        }
        return true;
    }
}
