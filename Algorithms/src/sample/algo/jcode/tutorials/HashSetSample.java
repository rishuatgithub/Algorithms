package sample.algo.jcode.tutorials;

import java.util.HashSet;

/**
 * demo of Hashset
 * @author Rishu
 *
 */
public class HashSetSample {
	
	public static void main(String[] args) {
		
		HashSet<Integer> hs=new HashSet<Integer>();
		
		hs.add(1);
		hs.add(2);
		hs.add(1);
		hs.add(3);

		System.out.println("The Data in HashSet : "+hs);
		System.out.println("The Size of HashSet : "+hs.size());
		
		hs.clear();
		
		System.out.println("The data of HashSet (after clear) :"+hs);
		
		//checking operators in hashset
		
		hs.add(1);
		hs.add(2);
		hs.add(1);
		hs.add(3);
		
		if(hs.contains(1)) {
			hs.remove(1);
		}
		
		System.out.println("The Data of HashSet : "+hs.iterator().next());
		
	}

}
