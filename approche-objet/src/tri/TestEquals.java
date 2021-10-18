package tri;

public class TestEquals {

	public static void main(String[] args) {
		
		Ville v1 = new Ville("Nice", 343_000);
		Ville v2 = v1;

		boolean result = v1.equals(v2);
		System.out.println(result);
	}
}