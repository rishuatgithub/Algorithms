package com.practise.hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Factorial {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
        
        int fact=1;
        
        for(int i=1; i<=N; i++) {
        	fact *= i;
        }
        
        System.out.println(fact);

	}

}
