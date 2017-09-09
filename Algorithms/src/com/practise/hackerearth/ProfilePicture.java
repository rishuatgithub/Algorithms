package com.practise.hackerearth;

import java.util.Scanner;

public class ProfilePicture {

	public static void main(String[] args){
		
		Scanner s = new Scanner(System.in);
		Scanner s1=new Scanner(System.in);
        int L = s.nextInt();
        int N = s.nextInt();
        
        String[] sb = new String[N];
        
        for(int i=0; i<N; i++) {
        	String dim=s1.nextLine();
        	String[] arr_dim = dim.split(" ");
        	
        	if(Integer.parseInt(arr_dim[0])<L || Integer.parseInt(arr_dim[1])<L) {
        		sb[i]="UPLOAD ANOTHER";
        	}else if(Integer.parseInt(arr_dim[0])==L && Integer.parseInt(arr_dim[1])==L) {
        		sb[i]="ACCEPTED";
        	}else {
        		sb[i]="CROP IT";
        	}
        	
        }
        
        s.close();
        s1.close();
        
        for(int j=0; j<N; j++) {
            System.out.println(sb[j]);
        }
        
        
	}

}
