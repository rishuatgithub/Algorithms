package com.practise.hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Prime number
 * @author Rishu
 *
 */
public class PrimeNumber {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
                
        for(int i=2; i<N; i++) {
        	boolean isPrime = true;
        	for(int j=2; j<i; j++) {
        		
        		if(i%j==0) {
        			isPrime=false;
        			break;
        		}
        	}
    		if(isPrime)
               System.out.print(i + " ");
        }
	}

}
