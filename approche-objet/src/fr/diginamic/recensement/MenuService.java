package fr.diginamic.recensement;

import java.util.Scanner;

/**
 * @author Felix
 *
 */
public abstract class MenuService {
	
	/**
	 * Classe service
	 * 
	 * @param recensement
	 * @param scanner
	 */
	public abstract void traiter(Recensement recensement, Scanner scanner);
	
}