import java.util.*;
import java.io.*;
class test{
	public static void main(String[] args) {
		int arr1[]={1,2,3,5,7,9,4,6};
		String s="qwertyuiopasdfghjklzxcvbnm";
		String s2=s.toLowerCase().replaceAll("\\s", "");
		HashSet<Character> s1 = new HashSet<>();
		for(int i=0;i<s2.length();i++)
		{
			char c = s2.charAt(i);
			s1.add(c);

		}
		System.out.println(s1.size());
		if(s1.size() == 26)
			System.out.println("pangram");
		else
			System.out.println("not a pangram");

		
		
	}
}
