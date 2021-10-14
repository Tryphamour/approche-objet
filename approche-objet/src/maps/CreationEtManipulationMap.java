package maps;

import java.util.HashMap;
import java.util.Map;

public class CreationEtManipulationMap {

	public static void main(String[] args) {

		HashMap<Integer, String> mapVilles = new HashMap<>();
		mapVilles.put(13, "Marseille");
		mapVilles.put(34, "Montpellier");
		mapVilles.put(44, "Nantes");
		mapVilles.put(75, "Paris");
		mapVilles.put(31, "Toulouse");
		mapVilles.put(59, "Lille");
		mapVilles.put(69, "Lyon");
		mapVilles.put(33, "Bordeaux");

		for (Map.Entry m : mapVilles.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		System.out.println("Taille de la map : " + mapVilles.size());
	}
}