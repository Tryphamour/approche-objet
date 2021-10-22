package fr.diginamic.recensement;

import java.util.Scanner;

/**
 * Classe qui recherche la population d'un département
 * 
 * @author Felix
 *
 */
public class RecherchePopulationDep extends MenuService {

	public RecherchePopulationDep() {

	}

	@Override
	public void traiter(Recensement recensement, Scanner scanner) {
		
		int popTotal = 0;
		
		System.out.println("Quelle d�partement (n�) ?");
		
		String reponse = scanner.nextLine();
		
		for (Ville ville : recensement.getListeVille()) {
			if (ville.getDep().getCodeDepart().equals(reponse)) {
				popTotal += ville.getPop();
			}
		}
		System.out.println("Le d�partement a une population de " + popTotal);
	}

}