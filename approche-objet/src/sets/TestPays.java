package sets;

import java.util.HashSet;

public class TestPays {

	public static void main(String[] args) {

		HashSet<Pays> pays = new HashSet<>();

		pays.add(new Pays("USA", 343_000, 43.52));
		pays.add(new Pays("USA", 343_000, 43.52));
		pays.add(new Pays("USA", 343_000, 43.52));
		pays.add(new Pays("USA", 343_000, 43.52));
		pays.add(new Pays("USA", 343_000, 43.52));
		pays.add(new Pays("USA", 343_000, 43.52));
		pays.add(new Pays("USA", 343_000, 43.52));
		pays.add(new Pays("USA", 343_000, 43.52));
		pays.add(new Pays("USA", 343_000, 43.52));

	}
}