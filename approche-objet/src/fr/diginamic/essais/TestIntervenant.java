package fr.diginamic.essais;

import fr.diginamic.salaire.*;

public class TestIntervenant {

	public static void main(String[] args) {

		Salarie salarie = new Salarie("Gaillard", "Félix", "Apprentissage", 1752.27);
		Pigiste pigiste = new Pigiste("Doe", "John", 48, 72.96);

		System.out.println("Salaire de " + salarie.getPrenom() + " " + salarie.getNom() + " : " + salarie.getSalaire() + " €");
		System.out.println("Salaire de " + pigiste.getPrenom() + " " + pigiste.getNom() + " : " + pigiste.getSalaire() + " €");

		System.out.println(salarie.afficherDonnees());
		System.out.println(pigiste.afficherDonnees());
	}
}