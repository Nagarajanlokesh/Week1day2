package week1.day2;

import java.util.Arrays;

public class ArrayExample {

	public static void main(String[] args) {
		
		
		//data saved with indices 
		// Index started with 0 so, 10= 0 , 20 = 1, 30 = 2 goes on 
		// here total number is 6 
		
		int[]number = { 10,80,20,90,30,100,40,110,50,120,60,130,70};
		
		// 2nd method to add array
		
		double[]number2 = new double[10];
		
		number2[0] = 1.11;
		number2[1] = 2.11;
		number2[2] = 4.11;
		number2[3] = 6.11;
		number2[4] = 9.11;
		number2[5] = 10.11;
		number2[6] = 5.11;
		number2[7] = 14.11;
		number2[8] = 17.11;
		number2[9] = 7.11;
		
		
		
		
		
		// to find the overall lenght of the array we use length variable 
		
		System.out.println(number.length);
		
		// to get value 60 we will give the index number in []
		
		System.out.println(number[5]);
		
		// the index of last data will be length-1 
		
		int lastNumber = number.length-1;  
		
		System.out.println(number[lastNumber]);
		
		// To short the data we use Arrays.sort()
		
		Arrays.sort(number);
		//Arrays.sort(number2);
		
		// To print all the data we should use for loop 
		
		// 0<6 so 10 will be printed similar in next itration   1<6 so 20 will be printed 
		
		for (int i = 0; i < number.length-1; i++) {
			
			System.out.println(number[i]);
			
		}
		
		
for (int i = 0; i < number2.length-1; i++) {
			
			System.out.println(number2[i]);
			
			
	}

}
}
