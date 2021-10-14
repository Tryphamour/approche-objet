package listes;

import java.util.ArrayList;
import java.util.Collections;

public class TestListeInt {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();
		list.add(-1);
		list.add(5);
		list.add(7);
		list.add(3);
		list.add(-2);
		list.add(4);
		list.add(8);
		list.add(5);

		System.out.println("Eléments du tableau : " + list);

		System.out.println("Taille du tableau : " + list.size());

		int max = Collections.max(list);
		System.out.println("Plus grand chiffre du tableau : " + max);

		list.remove(list.indexOf(Collections.min(list)));
		System.out.println("Suppresion du plus petit élément du tableau : " + list);

		for (int i = 0; i < list.size(); i++) {
			int nb = list.get(i);

			if (nb < 0) {
				list.set(i, -nb);
			}
		}
		System.out.println(list);
	}
}