import java.util.*;
import java.io.*;
class test{
	public static void main(String[] args) {
		int arr[]={3,1,3};
		int n = arr.length;
		Arrays.sort(arr);
		int repeat=0,miss=0;
		for(int i=0;i<n-1;i++)
		{
			int next=arr[i]+1;
			if((arr[i+1])!=next && arr[i+1]!=arr[i])
			{	
				miss=next;
				break;
			}
			else
				continue;
		}	
			for(int i=0;i<n-1;i++)
			{
			if(arr[i]==arr[i+1])
			repeat=arr[i];
			}		
		
		System.out.println("missing no = "+ miss);
		System.out.println("repeating no = "+ repeat);

             
    }

}
