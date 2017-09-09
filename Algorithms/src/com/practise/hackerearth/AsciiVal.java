package com.practise.hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AsciiVal {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
                
        System.out.println((int) line.charAt(0));

	}

}
