package fr.diginamic.essais;

import fr.diginamic.formes.Forme;

public class AffichageForme {

	public static void afficher(Forme forme) {
		System.out.println("Surface : " + forme.calculerSurface() + "\nP�rim�tre : " + forme.calculerPerimetre());
	}
}
