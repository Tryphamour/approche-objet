package fr.diginamic.utils;

import fr.diginamic.entites.Cercle;

public class CercleFactory {
	
	public double nouveauCercle;
	
	public CercleFactory(double nouveauCercle) {
		super();
		this.nouveauCercle = nouveauCercle;
	}
	
	public static Cercle CréerCercle(double nouveauCercle) {
		return new Cercle(nouveauCercle);
	}

	@Override
	public String toString() {
		return "CercleFactory [nouveauCercle=" + nouveauCercle + "]";
	}
}