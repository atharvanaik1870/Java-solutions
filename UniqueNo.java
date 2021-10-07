import java.util.*;
import java.io.*;
class test{
	public static void main(String[] args) {
		int arr1[]={1,2,3,5,7,9,4,6};
		int l=1,r=20,count=0;
        for(int i=l;i<=r;i++)
        {
            int num=i;
            boolean arr[]=new boolean[10];
            Arrays.fill(arr,false);
            while(num != 0)
            {
                if(arr[num%10] == true)
                    break;
                arr[num%10]=true;
                num=num/10;

            }
            if(num == 0)
                count++;

        }
        if(count>0)
            System.out.println(count);

		
		
	}
}
