import java.util.*;
import java.io.*;
class test{
	public static void main(String[] args) {
		int arr[]={1, 3, 5, 5, 5, 5, 67, 123, 125};
		int n = arr.length;
		int key=67;
		Arrays.sort(arr);
		int i,j=0;
		for (i=0;i<n ;i++ )
		{
			if(arr[i]==key)
			{
				System.out.println("first occurence at index=" + i);
				j=i;
				break;
			}
				
		}
		for(j=i;j<n-1;j++)
		{
			if(arr[j]==key && arr[j+1]!=arr[j])
			{
				System.out.println("last occurence at index =" + j);
				break;
			}
			else
				continue;
		}

             
    }

}
