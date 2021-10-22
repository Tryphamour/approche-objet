package fr.diginamic.recensement;

import java.util.Scanner;

/**
 * Classe qui recherche la population d'une ville
 * 
 * @author Felix
 *
 */
public class RecherchePopulationVille extends MenuService {

	public RecherchePopulationVille() {
	}

	@Override
	public void traiter(Recensement recensement, Scanner scanner) {

		System.out.println("Quelle ville ?");

		String reponse = scanner.nextLine();

		reponse = reponse.trim().replaceAll(" ", "");

		for (Ville ville : recensement.getListeVille()) {
			if (ville.getNomVille().equals(reponse)) {
				System.out.println("La ville a une population de " + ville.getPop() + " (dep "
						+ ville.getDep().getCodeDepart() + ")");
			}
		}
	}
}