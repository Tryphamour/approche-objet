package maps;

import java.util.HashMap;

public class CreationMap {

	public static void main(String[] args) {
		
		Employes e1 = new Employes("Paul", 1750);
		Employes e2 = new Employes("Hicham", 1825);
		Employes e3 = new Employes("Yu", 2250);
		Employes e4 = new Employes("Ingrid", 2015);
		Employes e5 = new Employes("Chantal", 2418);

		HashMap<String, Employes> mapSalaires = new HashMap<>();

		mapSalaires.put("e1", e1);
		mapSalaires.put("e2", e2);
		mapSalaires.put("e3", e3);
		mapSalaires.put("e4", e4);
		mapSalaires.put("e5", e5);
		
		System.out.println("Taille de la map : " + mapSalaires.size());
	}
}