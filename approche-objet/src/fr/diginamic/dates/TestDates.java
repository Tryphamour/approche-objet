package fr.diginamic.dates;

import java.util.Date;
import java.util.Locale;
import java.text.SimpleDateFormat;

public class TestDates {

	public static void main(String[] args) {

		@SuppressWarnings("deprecation")
		Date d1 = new Date(121, 18, 10, 14, 13, 12);
		SimpleDateFormat formateur1 = new SimpleDateFormat("EEEEE dd MMMMM yyyy", Locale.FRANCE);
		String chaine1 = formateur1.format(d1);
		System.out.println(chaine1);

		@SuppressWarnings("deprecation")
		Date d2 = new Date(116, 05, 19, 23, 59, 30);
		SimpleDateFormat formateur2 = new SimpleDateFormat("yyyy MMMMM EEEEE dd HH:mm:ss", Locale.FRANCE);
		String chaine2 = formateur2.format(d2);
		System.out.println(chaine2);

		Date d3 = new Date();
		SimpleDateFormat formateur3 = new SimpleDateFormat("yyyy MMMMM EEEEE dd HH:mm:ss", Locale.FRANCE);
		String chaine3 = formateur3.format(d3);
		System.out.println(chaine3);
	}
}