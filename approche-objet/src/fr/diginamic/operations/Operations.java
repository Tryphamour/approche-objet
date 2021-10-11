package fr.diginamic.operations;

public class Operations {

	public static double operation(double a, double b, char operateur) {

		switch (operateur) {
		case '+':
			return a + b;
		case '-':
			return a - b;
		case '*':
			return a * b;
		case '/':
			return a / b;
		default:
			throw new IllegalArgumentException("Unexpected value : " + operateur);
		}
	}
}