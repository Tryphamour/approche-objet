package fr.diginamic.banque.entites;

public class TestOperation {
	public static void main(String[] args) {

		Operation[] operations = new Operation[4];
		operations[0] = new Credit("08/10/21", 4500);
		operations[1] = new Credit("09/10/21", 12000);
		operations[2] = new Debit("10/10/21", 320);
		operations[3] = new Debit("11/10/21", 130);
		
		for (int a = 0; a < operations.length; a++) {
			System.out.println(operations[a]);
		}
	}
}
