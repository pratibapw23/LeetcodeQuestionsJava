package dailyTargated.medium;

public class BulbSwitcher {

	public static void main(String[] args) {
		int n=8;
		int res=bulbSwitcher(n);
		System.out.println(res);
	}

	private static int bulbSwitcher(int n) {
		return (int)Math.sqrt(n);
	}

}
