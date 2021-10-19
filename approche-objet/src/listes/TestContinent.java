package listes;

import java.util.ArrayList;

public class TestContinent {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ArrayList<Ville> villes = new ArrayList<>();
		villes.add(new Ville("New-York", 17, Continent.AMERIQUE));
		villes.add(new Ville("Paris", 14, Continent.EUROPE));
		
		for (Ville ville : villes) {
			System.out.println(ville);
		}
	}
}