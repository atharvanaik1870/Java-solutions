import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // Write your code here.
        Locale localindia= new Locale("en","in");
        NumberFormat us= NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat india= NumberFormat.getCurrencyInstance(localindia);                        NumberFormat china= NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat france= NumberFormat.getCurrencyInstance(Locale.FRANCE);


        
        System.out.println("US: " + us.format(payment));
        System.out.println("India: " + india.format(payment));
        System.out.println("China: " + china.format(payment));
        System.out.println("France: " + france.format(payment));
    }
}
