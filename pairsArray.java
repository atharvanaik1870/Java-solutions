import java.util.*;
import java.io.*;
class test{
	public static void main(String[] args) {
		int arr[]= {1, 5, 7, -1};
		Arrays.sort(arr); 
        int n= arr.length;
        int sum=6;
        int count=0;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]+arr[j] == sum)
                    count++;
            }
        }
        System.out.println(count);
		
	}

}
