package fr.diginamic.essais;

import fr.diginamic.operations.CalculMoyenne;

public class TestMoyenne {
	
	public static void main(String[] args) {
		
		double[] tableau = new double[5];
		CalculMoyenne resultat = new CalculMoyenne();
		resultat.add(10.5);
		resultat.add(24.2);
		System.out.println(resultat);
		System.out.println("Moyenne : " + resultat.calcul());
	}
}