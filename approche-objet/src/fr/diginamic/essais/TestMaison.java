package fr.diginamic.essais;

import fr.diginamic.maison.*;

public class TestMaison {

	public static void main(String[] args) {

		Maison maison = new Maison();
		Wc wc = new Wc(6.0, 1);
		SalleDeBain salleDeBain = new SalleDeBain(12.4, 1);
		Cuisine cuisine = new Cuisine(19.7, 0);
		Salon salon = new Salon(27.0, 0);
		Chambre chambre = new Chambre(20.5, 1);

		maison.ajouterPiece(wc);
		maison.ajouterPiece(salleDeBain);
		maison.ajouterPiece(cuisine);
		maison.ajouterPiece(salon);
		maison.ajouterPiece(chambre);

		System.out.println("La superficie de la maison est de : " + maison.superficieTotale() + " m²\n"
				+ "La superficie du RDC est de : " + maison.superficieEtage(0) + " m²\n"
				+ "La superficie du 1er étage est de : " + maison.superficieEtage(1) + " m²\n" + "La maison comporte "
				+ maison.getPieces().length + " pièces\n" + "Il y a " + maison.typePiece("Cuisine")
				+ " cuisine(s) qui ont une superficie totale de " + maison.superficiePieces("Cuisine") + " m²");
	}

}