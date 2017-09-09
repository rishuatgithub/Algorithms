package com.practise.hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Palindrome {

	public static void main(String[] args) throws IOException {
		
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       String line = br.readLine();

       int i1=0;
       int i2=line.length()-1;
       int pal=0;

       char[] c=line.toCharArray();
       
       while(i2>i1) {
    	   if(c[i1] != c[i2]) {
    		   pal=1;
    	   }
    	   
    	   i1++;
    	   i2--;
       }
       
       if(pal==1) {
    	   System.out.println("NO");
       }else {
    	   System.out.println("YES");   
       }
       
	}

}
