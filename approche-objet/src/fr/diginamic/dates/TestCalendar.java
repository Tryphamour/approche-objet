package fr.diginamic.dates;

import java.text.SimpleDateFormat;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TestCalendar {

	public static void main(String[] args) {

		Calendar cal1 = Calendar.getInstance();
		cal1.set(2016, 04, 19, 23, 59, 30);
		Date d1 = cal1.getTime();
		SimpleDateFormat formateur1 = new SimpleDateFormat("EEEEE dd MMMMM yyyy", Locale.FRANCE);
		String chaine1 = formateur1.format(d1);
		System.out.println(chaine1);

		Calendar cal2 = Calendar.getInstance();
		Date d2 = cal2.getTime();
		SimpleDateFormat formateur2 = new SimpleDateFormat("yyyy MMMMM EEEEE dd HH:mm:ss", Locale.FRANCE);
		String chaine2 = formateur2.format(d2);
		System.out.println(chaine2);

		SimpleDateFormat formateur3 = new SimpleDateFormat("yyyy MMMMM EEEEE dd HH:mm:ss", Locale.CHINA);
		String chaine3 = formateur3.format(d2);
		System.out.println(chaine3);

		Locale russe = new Locale("ru");
		SimpleDateFormat formateur4 = new SimpleDateFormat("yyyy MMMMM EEEEE dd HH:mm:ss", russe);
		String chaine4 = formateur4.format(d2);
		System.out.println(chaine4);
	}
}