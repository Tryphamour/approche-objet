package fr.diginamic.recensement;

import java.util.Scanner;

public class RecherchePopulationDep extends MenuService {

	public RecherchePopulationDep() {

	}

	@Override
	public void traiter(Recensement recensement, Scanner scanner) {
		
		int popTotal = 0;
		
		System.out.println("Quelle département (n°) ?");
		
		String reponse = scanner.nextLine();
		
		for (Ville ville : recensement.getListeVille()) {
			if (ville.getDep().getCodeDepart().equals(reponse)) {
				popTotal += ville.getPop();
			}
		}
		System.out.println("Le département a une population de " + popTotal);
	}

}