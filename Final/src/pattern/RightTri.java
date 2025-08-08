package pattern;

public class RightTri {

	static void leftT() {
		int n = 5;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}

	static void leftT1() {
		int n = 5;
		for (int i = 0; i < n; i++) {
			for (int j = 1; j <= i + 1; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// Left Triangle
		leftT();
		leftT1();
	}

}
