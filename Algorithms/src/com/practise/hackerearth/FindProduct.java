package com.practise.hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindProduct {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line1 = br.readLine();
        String line2 = br.readLine();
        
        long answer=1;
        int arr_size= Integer.parseInt(line1);
        
        String[] num = line2.split(" ");
        
        for(int i=0; i<arr_size; i++){
            answer = (answer * Long.parseLong(num[i]) % 1000000007);
            
        }
        
        System.out.println(answer);
    }

}
