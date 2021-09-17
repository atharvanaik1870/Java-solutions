import java.util.*;
import java.io.*;
class test{
	public static void main(String[] args) {
		int arr1[]={1,2,3,5,7,9,4,6};
		int left=0,right=arr1.length-1;
		while(left<right)
		{
			while(arr1[left]%2 ==0 && left<right)
				left++;

			while(arr1[right]%2 !=0 && left<right)
				right--;
			if(left<right)
			{
				int temp=arr1[left];
				arr1[left]=arr1[right];
				arr1[right]=temp;

				left++;
				right--;
				
		  	}
		}
		for (int i=0;i<arr1.length;i++ )
		{
			System.out.printf(arr1[i] + " ");	
		}
		
		
}
}
/*
//space complexity : O(n);
int arr2[]= new int[arr1.length];
		int j=0;
		for(int i=0;i<arr1.length;i++)
		{
			if(arr1[i]%2 == 0)
			{
				arr2[j]=arr1[i];
				j++;
			}
			else
				continue;
		}
		for(int i=0;i<arr1.length;i++)
		{
			if(arr1[i]%2 != 0)
			{
				arr2[j]=arr1[i];
				j++;
			}
			else
				continue;
		}
		for(int i=0;i<arr2.length;i++)
			System.out.print(arr2[i]+ " ");
*/
