package com.practise.hackerearth;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Conversion of strings to Upper and Lower cases
 * @author Rishu
 *
 */
public class ConvertString {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        

        StringBuilder sb = new StringBuilder();
        for (char c : line.toCharArray()) {
        	
        	if((int)c>=65 && (int)c<=90) {
        		sb.append(Character.toLowerCase(c));
        	}else if((int)c>=97 && (int)c<=122) {
        		sb.append(Character.toUpperCase(c));
        	}
        	
        }
        
        System.out.println(sb.toString());
        
       
	}

}
