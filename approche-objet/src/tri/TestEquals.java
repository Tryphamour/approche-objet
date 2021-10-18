package tri;

public class TestEquals {

	public static void main(String[] args) {
		
		Ville v1 = new Ville("Nice", 343_000);
		Ville v2 = new Ville("Nice", 343_000);

		System.out.println(v1.equals(v2));
	}
}