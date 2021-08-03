import java.util.*;
class test{
	public static void main(String[] args) {
		int arr[]= {-1,2,-5,6,9,0,4,-7,-10};
		int n=arr.length;
		int j=0;
		for(int i=0;i<n;i++)
		{
			if(arr[i]<0)
			{
				if(i!=j)
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				j++;
			}
		}
		for (int i=0;i<n ;i++ )
		{
			System.out.print(arr[i] + " ");
		}
		
	}

}
