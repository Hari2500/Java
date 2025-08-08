package pattern;

public class CenterTriangle {

	static void centerT() {
		int n = 5;
		for (int i = 1; i <= n; i++) {
			for(int j= i; j<=n; j++) {
				System.out.print("  ");
			}
			for(int k= 1; k<i; k++) {
				System.out.print("* ");
			}
			for(int k= 1; k<=i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// Centered Triangle

		centerT();

	}

}
