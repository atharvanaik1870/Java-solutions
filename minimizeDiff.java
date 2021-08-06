import java.util.*;
import java.io.*;
class test{
	public static void main(String[] args) {
		int arr[]= {1,15,10};
		Arrays.sort(arr); 
        int n= arr.length;
        int k=6;
        int ans=arr[n-1]-arr[0];
        int big=arr[n-1]-k;
        int small=arr[0]+k;
        if(small>big)
        {
            int temp=small;
            small=big;
            big=temp;
        }
        for(int i=1;i<n-1;i++)
        {
            int sub=arr[i]-k;
            int add=arr[i]+k;

            if(sub>=small || add<=big)
                continue;
            if(big-sub <= add-small)
            {
                small=sub;
            }
            else
                big=add;

        }
        System.out.println(Math.min(ans,big-small));
      
		
	}

}
