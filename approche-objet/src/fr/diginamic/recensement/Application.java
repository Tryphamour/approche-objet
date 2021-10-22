package fr.diginamic.recensement;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

/**
 * Classe d'application
 * 
 * @author Felix
 *
 */
public class Application {

	/**
	 * @param args
	 * @throws IOException
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws IOException, InterruptedException {

		Path path = Paths.get("C:/Users/sonag/Documents/Diginamic/tp/java/objet/recensement.csv");
		boolean estFichier = Files.isRegularFile(path);
		boolean estLisible = Files.isReadable(path);

		Scanner sc = new Scanner(System.in);
		Scanner scanner = new Scanner(System.in);

		if (estFichier) {
			if (estLisible) {
				List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);
				Recensement recensement = new Recensement(lines);
				boolean leave = false;
				while (!leave) {
					System.out.println("Que veux tu faire ?\n" + "| 1. Population d�une ville donn�e\n"
							+ "| 2. Population d�un d�partement donn�\n" + "| 3. Population d�une r�gion donn�e\n"
							+ "| 4. Afficher les 10 r�gions les plus peupl�es\n"
							+ "| 5. Afficher les 10 d�partements les plus peupl�s\n"
							+ "| 6. Afficher les 10 villes les plus peupl�es d�un d�partement\n"
							+ "| 7. Afficher les 10 villes les plus peupl�es d�une r�gion\n"
							+ "| 8. Afficher les 10 villes les plus peupl�es de France\n" + "| 9. Sortir");
					int choix = sc.nextInt();
					switch (choix) {
					case 1:
						RecherchePopulationVille ville = new RecherchePopulationVille();
						ville.traiter(recensement, scanner);
						break;
					case 2:
						RecherchePopulationDep departement = new RecherchePopulationDep();
						departement.traiter(recensement, scanner);
						break;
					case 3:
						RecherchePopulationReg region = new RecherchePopulationReg();
						region.traiter(recensement, scanner);
						break;
					case 4:
						RegionPlusPeuplee reg10 = new RegionPlusPeuplee();
						reg10.traiter(recensement, scanner);
						break;
					case 5:
						DepartementPlusPeuple dep10 = new DepartementPlusPeuple();
						dep10.traiter(recensement, scanner);
						break;
					case 6:
						VilleDep vildep = new VilleDep();
						vildep.traiter(recensement, scanner);
						break;
					case 7:
						VilleReg vilreg = new VilleReg();
						vilreg.traiter(recensement, scanner);
						break;
					case 8:
						VillePlusPeuplee ville10 = new VillePlusPeuplee();
						ville10.traiter(recensement, scanner);
						break;
					case 9:
						leave = true;
						break;
					default:
						System.err.println("Choix incorrect!");
						break;

					}

					Thread.sleep(7000);
				}
				System.out.println("Merci et � bient�t!");
			} else {
				System.err.println("Probl�me de lecture");
			}
		} else {
			System.err.println("Probl�me de fichier");
		}

	}
}