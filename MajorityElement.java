import java.util.*;
import java.io.*;
class test{
	public static void main(String[] args) {
		int arr[]={3, 3, 4, 2, 4, 4, 2, 4, 4};
		int n = arr.length;
		HashMap<Integer,Integer> m = new HashMap<Integer,Integer>();
		for(int i=0;i<n;i++)
		{
			if(m.containsKey(arr[i]))
			{
				int count= m.get(arr[i])+1;
				if(count > n/2)
				{
					System.out.println("majoroty element is = " +arr[i]);
				}
				else
					m.put(arr[i],count);
			}
			else
				m.put(arr[i],1);
		}
		System.out.println("No majority element..");      
    }

}
