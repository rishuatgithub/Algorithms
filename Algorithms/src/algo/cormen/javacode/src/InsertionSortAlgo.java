package algo.cormen.javacode.src;

import sample.algo.jcode.dataset.DataSet;

/**
 * Algorithm to demonstrate INSERTION-SORT on a set of data
 * @author Rishu
 *
 */

/**
 * pseudocode: INSERTION-SORT(A)  
 * 
 * 
 * 
 *
 */
public class InsertionSortAlgo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer[] A={5,2,4,6,1,3};
		//Integer[] B;
			
		for(int j=1; j<=A.length-1; j++){
			
			int key=A[j];
					
			int i=j-1;
			
			//System.out.println("j ="+j+" key :"+key+" i: "+i);
			
			//if(A[i]>key) System.out.println(i + " "+A[i]+" "+key);
			
			while(i>=0 && A[i]>key){
				System.out.println(A[i]+" here "+i);
				
				A[i+1]=A[i];
				
				i=i-1;
				//System.out.println(i +" : "+A[i]);			
			}
			
			A[i+1]=key;		
			
		}
		
		
		for(int i=0; i<A.length; i++){
			//System.out.print(A[i]+" ");
		}

	}

}
