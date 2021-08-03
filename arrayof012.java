import java.util.*;
class test{
	public static void main(String[] args) {
		int arr[]= {0,1,2,1,2,1,2,1,0,0,2,0};
		int n=arr.length;
		int i,cnt0=0,cnt1=0,cnt2=0;
		for (int j=0;j<n ;j++ ) 
		{
			switch(arr[j])
			{
				case 0:
					cnt0++;
					break;
				case 1:
                	cnt1++;
                	break;
            	case 2:
                	cnt2++;
                	break;

			}	
		}
		i=0;
		while(cnt0>0)
		{
			arr[i++]=0;
			cnt0--;
		}
		while(cnt1>0)
		{
			arr[i++]=1;
			cnt1--;
		}
		while(cnt2>0)
		{
			arr[i++]=2;
			cnt2--;
		}

		for (int j=0;j<n ;j++ )
		System.out.print(arr[j]+ " "); 

		
	}

}
