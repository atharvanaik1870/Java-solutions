import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        List<Integer> l1= new ArrayList<Integer>();
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int l =sc.nextInt();
            l1.add(l);
        }

        int q=sc.nextInt();
        for(int j=0;j<q;j++){
            String inp = sc.next();
            if(inp.equals("Insert")){
                int x = sc.nextInt();
                int y = sc.nextInt();
                l1.add(x,y);
            }
            else{
                //delete
                int z = sc.nextInt();
                l1.remove(z);
            }
            //System.out.println();
        }
        for(int num : l1){
            System.out.print(num + " ");
        }
        
    }
}
