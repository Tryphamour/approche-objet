package fr.diginamic.essais;

import fr.diginamic.entites.Theatre;

public class TestTheatre {

	public static void main(String[] args) throws Exception {

		Theatre testTheatre = new Theatre("JAVA Comédie", 1000);
		
		testTheatre.inscrire(750, 5.9);
		testTheatre.inscrire(250, 5.9);
		System.out.println(testTheatre.getClientInscrit());
		System.out.println(testTheatre.getTotalRecette());
	}
}
