package fr.diginamic.recensement;

import java.util.Comparator;
import java.util.Map;

/**
 * Classe comparator
 * 
 * @author Felix
 *
 */
public class ComparatorPerso implements Comparator<String> {

	Map<String, Integer> base;

	/**
	 * @param base
	 */
	public ComparatorPerso(Map<String, Integer> base) {
		this.base = base;
	}

	public int compare(String o1, String o2) {
		if (base.get(o1) <= base.get(o2)) {
			return 1;
		} else {
			return -1;
		}
	}
}