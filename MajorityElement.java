import java.util.*;
import java.io.*;
class test{
	public static void main(String[] args) {
		int arr[]={3, 3, 4, 2, 4, 4, 2, 4, 4};
		int n = arr.length;
		//Arrays.sort(arr);
		int maxcount=0,index=-1;
		for(int i=0;i<n;i++)
		{
			int count=0;
			for(int j=0;j<n;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;

				}
			}
			if(maxcount<count)
			{
				maxcount=count;
				index=i;
			}
		}
		if(maxcount > n/2)
			System.out.println("majority element is = "+ arr[index]);
		else
			System.out.println("no majority elemeny..");


             
    }

}
