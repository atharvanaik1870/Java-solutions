import java.util.*;
import java.io.*;
class test{
	public static void main(String[] args) {
		String s1 = "AACD";
        String s2 ="ACDA";
        String temp = s1+s1;
        System.out.println(temp.indexOf(s2));

        if(s1.length() == s2.length() && temp.indexOf(s2) != -1)
            System.out.println(true);
        else
            System.out.println(false);
    }

}
