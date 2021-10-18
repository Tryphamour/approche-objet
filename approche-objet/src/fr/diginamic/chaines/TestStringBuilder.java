package fr.diginamic.chaines;

public class TestStringBuilder {

	public static void main(String[] args) {

		long debut = System.currentTimeMillis();
		
		StringBuilder builder = new StringBuilder();
		for (int i = 1; i <= 100000; i++) {
			builder.append(i);
		}

		long fin = System.currentTimeMillis();
		System.out.println("Temps écoulé en millisecondes : " + (fin - debut) + "ms");

//		Comparaison de performance entre StringBuilder et String
		
		long debut1 = System.currentTimeMillis();
		
		String chaine = "";
		for (int i = 1; i <= 100000; i++) {
			chaine = chaine + i;
		}
		
		long fin1 = System.currentTimeMillis();
		System.out.println("Temps écoulé en millisecondes : " + (fin1 - debut1) + "ms");
	}
}