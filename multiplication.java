import java.util.*;
import java.io.*;
class test{
	public static void main(String[] args) {
		int arr[]= {1, 5, 7, 8,9,55,44,20};
        int n=arr.length;
        int res=0;
        int a=5,k=25;
        //multiply a*k without using * 
        while(k>0)
        {
            k--;
            res=multiply(a,res);

        }
        System.out.print(res);


    }
    static int multiply(int a,int res)
    {
        res=res+a;
        return res;
    }

}
