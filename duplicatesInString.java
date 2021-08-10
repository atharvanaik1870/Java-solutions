import java.util.*;
import java.io.*;
class test{
	public static void main(String[] args) {
		String s = "testString";
        int count =0;
        String s1=s.toLowerCase();
        for (int i=0;i<s1.length() ;i++ )
        {
            for(int j=i+1;j<s1.length();j++)
            {
                if(s1.charAt(i)==s1.charAt(j))
                {
                    count++;
                    System.out.println(s1.charAt(i));
                }
            }
        }
        System.out.print("no of duplicates = "+ count);
    }

}
