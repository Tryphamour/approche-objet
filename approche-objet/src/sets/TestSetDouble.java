package sets;

import java.util.Collections;
import java.util.HashSet;

public class TestSetDouble {

	public static void main(String[] args) {

		HashSet<Double> set = new HashSet<>();
		set.add(1.5);
		set.add(8.25);
		set.add(-7.32);
		set.add(13.3);
		set.add(-12.45);
		set.add(48.5);
		set.add(0.01);
		
		System.out.println(set);
		
		double max = Collections.max(set);
		System.out.println("Plus grand chiffre du tableau : " + max);
		
		set.remove(Collections.min(set));
		System.out.println("Suppresion du plus petit élément du tableau : " + set);
	}
}