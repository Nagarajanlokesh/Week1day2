package week1.day2;

import org.openqa.selenium.devtools.v85.input.Input;

public class PassInputInMethod {
	
	// here we can pass inside ()
	
	public void method1(String name, int age, int empId, char initial) {
		
		System.out.println(name + age + empId + initial);

	}

	public static void main(String[] args) {
		
		
		PassInputInMethod output = new PassInputInMethod();
		
		output.method1("loki",25,49350,'N');
		

				
				
		
	}

}
