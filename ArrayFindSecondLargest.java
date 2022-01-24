package week1.day2;

import java.util.Arrays;
import java.util.Iterator;

public class ArrayFindSecondLargest {

	public static void main(String[] args) {
		
		int[] data = {3,2,11,4,6,7};
				
				Arrays.sort(data);
		
				// 2,3,4,6,7,11
			int findNumber = 	data.length-2;
			
			
				
				System.out.println(data[findNumber]);
				
			 

	}

}
