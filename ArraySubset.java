import java.util.*;
import java.io.*;
class test{
	public static void main(String[] args) {
		int arr[]= {1, 5, 7, 8,9,55,44,20};
        int n=arr.length;
        int arr2[]={1,5,7,8};
		Arrays.sort(arr);
        boolean flag=true;
        for(int i=0;i<arr2.length;i++)
        {
            if(binarySearch(arr,0,n-1,arr2[i])==-1)
                flag=false;

        }
        System.out.println(flag);
		
	}

/*llll/**/
static int binarySearch(int arr[],int low,int high,int x)
{
    if(high>=low)
    {
        int mid=(low+high)/2;

        if(arr[mid]==x)
            return mid;
        if(x>arr[mid])
            return binarySearch(arr,(mid+1),high,x);
        if(x<arr[mid])
            return binarySearch(arr,0,(mid-1),x);

    }
    return -1;
}
}
