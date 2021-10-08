package fr.diginamic.banque.entites;

public class TestBanque {

	public static void main(String[] args) {

		Compte[] comptes = new Compte[2];
		comptes[0] = new Compte(123456, 9876.54);
		comptes[1] = new CompteTaux(123456, 9876.54, 0.25);

		for (int a = 0; a < comptes.length; a++) {
			System.out.println(comptes[a]);
		}
	}
}