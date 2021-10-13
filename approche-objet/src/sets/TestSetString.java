package sets;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;

public class TestSetString {

	public static void main(String[] args) {
		
		HashSet<String> set = new HashSet<>();
		set.add("USA");
		set.add("France");
		set.add("Allemagne");
		set.add("UK");
		set.add("Italie");
		set.add("Japon");
		set.add("Chine");
		set.add("Russie");
		set.add("Inde");

		String max = Collections.max(set, Comparator.comparing(String::length));
		System.out.println("Pays avec le plus grand nombre de lettres : " + max);
		set.remove(max);
		System.out.println(set);
		
	}
}