package week1.day2;

public class WhileLoopArmstrong {
	
	public static void main(String[] args) {
		
		//armstrong number 
		// input is 153 = 1*1*1 + 5*5*5 + 3*3*3 
		
		int input = 153; 
		
		int orginalInput = input;
		
		int sum = 0;
		
		// Till the input is coming to zero execution will repeat 
		while (input>0) {
			
			int rem = input % 10 ;
			 sum = sum +(rem*rem*rem);
			input = input / 10;
			
			
		}
		
		if (sum==orginalInput) {
			
			System.out.println("Correct");
			
			
		}
		else {
			System.out.println("incorrect");
		}
		
	}

}
