package week1.day2;

import net.bytebuddy.implementation.bytecode.Addition;

public class CalculatorExc {

	// here we use return statement and passing input in method

	public int additionExample(int num1, int num2) {

		return num1 + num2;

	}

	public double subExample(double num3, double num4) {

		return num3 - num4;

	}

	public int multiplyExample(int num5, int num6) {

		return num5 * num6;

	}

	public int divideExample(int num7, int num8) {

		return num7 / num8;

	}

	public static void main(String[] args) {

		CalculatorExc calc = new CalculatorExc();

		int add = calc.additionExample(10, 20);
		System.out.println(add);

		double sub = calc.subExample(40.13, 10.33);
		System.out.println(sub);

		int mul = calc.multiplyExample(10, 20);
		System.out.println(mul);

		int div = calc.divideExample(50, 10);
		System.out.println(div);

	}

}
