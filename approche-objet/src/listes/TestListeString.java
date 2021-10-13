package listes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestListeString {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>();
		list.add("Nice");
		list.add("Carcassonne");
		list.add("Narbonne");
		list.add("Lyon");
		list.add("Foix");
		list.add("Pau");
		list.add("Marseille");
		list.add("Tarbes");

		String max = Collections.max(list, Comparator.comparing(String::length));
		System.out.println("Ville avec le plus grand nombre de lettres : " + max);

		for (int i = 0; i < list.size(); i++) {
			String newList = list.get(i).toUpperCase();
			list.set(i, newList);
		}
		System.out.println("Tableau avec tous les noms de ville en majuscules : " + list);

		for (int i = list.size(); --i >= 0;) {
			String newList = list.get(i);
			if (newList.charAt(0) == 'N') {
				list.remove(i);
			}
		}
		System.out.println("Tableau sans les villes commancant par la lettre N : " + list);
	}
}