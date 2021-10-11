package fr.diginamic.essais;

import fr.diginamic.operations.Operations;

public class TestOperations {
	
	public static void main(String[] args) {
		System.out.println(Operations.operation(5, 10, '+'));
		System.out.println(Operations.operation(10, 5, '-'));
		System.out.println(Operations.operation(5, 10, '*'));
		System.out.println(Operations.operation(10, 5, '/'));
	}
}