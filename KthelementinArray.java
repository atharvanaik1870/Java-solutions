import java.util.*;
import java.io.*;
class test{
	public static void main(String[] args) {
		int arr1[]={1,2,3,5,7,9,55};
		int arr2[]={11,25,36,58,73,93,95};
		int m=arr1.length;
		int n=arr2.length;
		int arr3[]=new int[m+n];
		int i=0,j=0,r=0;
		int k=5;//to find the k th element in two sorted arrays
		while(i<m && j<n)
		{
			if(arr1[i]<arr2[j])
				arr3[r++]=arr1[i++];
			else
				arr3[r++]=arr2[j++];
		}
		while(i<m)
		{
			arr3[r++]=arr1[i++];
		}
		while(j<n)
		{
			arr3[r++]=arr2[j++];
		}
		for (int p=0;p<arr3.length ;p++ )
		 {
			System.out.print(arr3[p]+" ");
		}
		System.out.println("\n"+arr3[k-1]);
		

}
}
