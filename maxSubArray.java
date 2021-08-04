import java.util.*;
class test{
	public static void main(String[] args) {
		int arr[]= {-2, -3, 4, -1, -2, 1, 5, -3};
		int max=0,max_now=0;
		for(int i=0;i<arr.length;i++)
		{
			max_now=max_now+arr[i];
			if(max_now>max)
				max=max_now;
			else if (max_now<0)
			{
				max_now=0;
			}

		}
		System.out.print("sum of maximum subarray is..\t" + max);
		
		
	}

}
