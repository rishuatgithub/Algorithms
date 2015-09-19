package sample.algo.jcode.peakfinding;

import sample.algo.jcode.dataset.DataSet;

/**
 * Using PEAK FINDING ALGO to find the peak element in a OneDimensional Dataset
 * @author Rishu
 *
 */
public class PeakFindingOneDim {

	public static void main(String[] args) {
		
		DataSet dsob=new DataSet();
		
		for(int i=0; i<dsob.onedimensionalarray().length;i++){
			
			//System.out.println(i+" = "+dsob.onedimensionalarray()[i]);
			
			int arrayData1 = 0,arrayData2 = 0,arrayData3 = 0;
			
			if(i==0){
				arrayData1=dsob.onedimensionalarray()[i];
				arrayData2=dsob.onedimensionalarray()[i+1];
				arrayData3=0;
								
			}else if(i==dsob.onedimensionalarray().length){
				
				arrayData1=dsob.onedimensionalarray()[i];
				arrayData2=0;
				arrayData3=0;
				
			}else{
				System.out.println(i);
				arrayData1=dsob.onedimensionalarray()[i];
				arrayData2=dsob.onedimensionalarray()[i+1];
				arrayData3=dsob.onedimensionalarray()[i-1];
			}
			
			
			if(arrayData1>arrayData2 && arrayData1>arrayData3){
				System.out.println("Possible Peak Element = "+arrayData1);
			}
		}
		
		
	}
	
}
