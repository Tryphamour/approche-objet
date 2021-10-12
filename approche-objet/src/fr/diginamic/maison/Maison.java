package fr.diginamic.maison;

import java.util.Arrays;

public class Maison {

	private Piece[] pieces;

	public Maison() {
		this.pieces = new Piece[0];
	}

	public Piece[] getPieces() {
		return pieces;
	}

	public void setPieces(Piece[] pieces) {
		this.pieces = pieces;
	}

	public void ajouterPiece(Piece piece) {
		if (piece == null)
			System.err.println("Erreur, pièce = null");
		else {
			pieces = Arrays.copyOf(pieces, pieces.length + 1);
			pieces[pieces.length - 1] = piece;
		}
	}

	public double superficieTotale() {
		double total = 0;
		for (int i = 0; i < pieces.length; i++)
			total += pieces[i].getSuperficie();
		return total;

	}

	public double superficieEtage(int etage) {
		double total = 0;
		for (int i = 0; i < pieces.length; i++) {
			if (etage == pieces[i].getEtage())
				total += pieces[i].getSuperficie();
		}
		return total;
	}
	
	public int typePiece(String type) {
		int total = 0;
		for (int i = 0; i < pieces.length; i++) {
			if (pieces[i].getType() == type) 
				total ++;
		}
		return total;
	}
	
	public double superficiePieces(String type) {
		double total = 0;
		for (int i = 0; i < pieces.length; i++) {
			if (pieces[i].getType() == type) 
				total += pieces[i].getSuperficie();
		}
		return total;
	}
}
