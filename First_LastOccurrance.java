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
//Approach 2 
//Time complexity = O(log n)
class Solution {
    public int[] searchRange(int[] arr, int target) {
        
        int start = search(arr, target, true);
        int end = search(arr, target, false);
        int a[] = { -1, -1 };

        a[0] = start;
        a[1] = end;

        return a;
    }
    
    public static int search(int arr[], int target, boolean searchfirst) {
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                ans = mid;
                if (searchfirst) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
