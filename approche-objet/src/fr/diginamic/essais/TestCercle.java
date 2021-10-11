package fr.diginamic.essais;

import fr.diginamic.entites.Cercle;
import fr.diginamic.utils.CercleFactory;

public class TestCercle {

	public static void main(String[] args) {

		Cercle c1 = new Cercle(6.2);
		Cercle c2 = new Cercle(12.6);

		System.out.println("Périmètre du 1er cercle : " + c1.perimetre() + " cm");
		System.out.println("Surface du 1er cercle : " + c1.surface() + " cm²");
		System.out.println("Périmètre du 2nd cercle : " + c2.perimetre() + " cm");
		System.out.println("Surface du 2nd cercle : " + c2.surface() + " cm²");

		System.out.println(CercleFactory.CréerCercle(Math.random() * 100));
	}
}