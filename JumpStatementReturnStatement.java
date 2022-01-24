package week1.day2;

public class JumpStatementReturnStatement {
	
	// 1st method created 
	// here we use string to return value 
	// void - will not return any thing it will perfom the action 

	
	public String example1() {
		
		return "loki";
		

	}
	
	// method 2 
	//here we use int 
	
	public int example2() {
		
		return 1996;

	}
	
	//method3 
	
public char example3() {
		
		return 'N';

	}

//method4
public String example4() {
	
	return "Binnylane";

}
	
	


	public static void main(String[] args) {
		
		JumpStatementReturnStatement  result = new JumpStatementReturnStatement();
		
		System.out.println(result.example1());
		System.out.println(result.example2());
		System.out.println(result.example3());
		
		// one more method to do same operation 
		
		String address = result.example4();
		System.out.println("My address is "+ address);
		

		
		

	}

}
