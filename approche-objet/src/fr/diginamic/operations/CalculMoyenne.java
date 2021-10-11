package fr.diginamic.operations;

import java.util.Arrays;

public class CalculMoyenne {

	double[] array = new double[0];
	
	public void add(double newDouble) {
		
		double[] tempo = new double[array.length+1];
		for (int i =0; i < array.length; i++) {
			tempo[i] = array[i];
		}
		tempo[tempo.length-1] = newDouble;
		array = tempo;
	}
	
	public double calcul() {
		double total = 0.0;
		for (int i = 0; i < array.length; i++) {
			total = total + array[i];
		}
		return total / array.length;
	}
	
	@Override
	public String toString() {
		return "Tableau : " + Arrays.toString(array);
	}
}