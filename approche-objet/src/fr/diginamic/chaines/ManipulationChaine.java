package fr.diginamic.chaines;

import java.util.Arrays;

public class ManipulationChaine {
	static String chaine = "Durand;Marcel;2 523.5";
	
	public static String getChaine() {
		return chaine;
	}

	public static void main(String[] args) {
		
		char premierCaractere = chaine.charAt(0);
		System.out.println("Premier caractère: " + premierCaractere);
		
		int longueurChaine = chaine.length();
		System.out.println(longueurChaine);
		
		int index = chaine.indexOf('d');
		System.out.println(index);
		
		String debutFin = chaine.substring(0, 6);
		System.out.println(debutFin.toUpperCase());
		System.out.println(debutFin.toLowerCase());
		
		String[] arrayOfChaine = chaine.split(";");
		System.out.println(Arrays.toString(arrayOfChaine));
		
	}
}