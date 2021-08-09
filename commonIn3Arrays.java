import java.util.*;
import java.io.*;
class test{
	public static void main(String[] args) {
		int arr1[]= {1,2,3,4,5,6,6,7,8};
        //int n=arr.length;
        int arr2[]={2,3,4,5,6,7,8};
        int arr3[]={4,5,6};
        int freq[]= new int[arr1.length+arr2.length+arr3.length];
        int res1=1;
        for(int i=1;i<arr1.length;i++)
        {
            if (arr1[i] != arr1[res1 - 1])
            {
                arr1[res1] = arr1[i];
                res1++;
            }

        }
        int res2=1;
        for(int i=1;i<arr2.length;i++)
        {
            if (arr2[i] != arr2[res2 - 1])
            {
                arr2[res2] = arr2[i];
                res2++;
            }

        }
        int res3=1;
        for(int i=1;i<arr3.length;i++)
        {
            if (arr3[i] != arr3[res3 - 1])
            {
                arr3[res3] = arr3[i];
                res3++;
            }

        }
        for (int i=0;i<res1;i++ ) 
            freq[arr1[i]]++;
        for (int i=0;i<res2;i++ ) 
            freq[arr2[i]]++;
        for (int i=0;i<res3;i++ ) 
            freq[arr3[i]]++;

        for(int j=0;j<freq.length;j++)
        {
            if(freq[j] == 3)
                System.out.println(j+ " ");
        }
    }

}
