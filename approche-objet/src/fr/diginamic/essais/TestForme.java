package fr.diginamic.essais;

import fr.diginamic.formes.*;

public class TestForme {

	public static void main(String[] args) {

		Cercle cercle = new Cercle(10);
		Rectangle rectangle = new Rectangle(10, 5);
		Carre carre = new Carre(20);
		
		System.out.println("- Cercle :");
		AffichageForme.afficher(cercle);
		System.out.println("- Rectangle :");
		AffichageForme.afficher(rectangle);
		System.out.println("- Carre :");
		AffichageForme.afficher(carre);
	}
}