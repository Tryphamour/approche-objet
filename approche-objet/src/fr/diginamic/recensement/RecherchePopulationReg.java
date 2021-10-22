package fr.diginamic.recensement;

import java.util.Scanner;

/**
 * Classe qui recherche la population d'une région
 * 
 * @author Felix
 *
 */
public class RecherchePopulationReg extends MenuService {

	public RecherchePopulationReg() {
	}

	@Override
	public void traiter(Recensement recensement, Scanner scanner) {

		int popTotal = 0;
		
		System.out.println("Quelle r�gion ?");
		
		String reponse = scanner.nextLine();
		
		reponse = reponse.trim().replaceAll(" ", "");
		
		for (Ville ville : recensement.getListeVille()) {
			if (ville.getDep().getRegion().getNomRegion().equals(reponse)) {
				popTotal += ville.getPop();
			}
		}
		System.out.println("La r�gion a une population de " + popTotal);
	}
}