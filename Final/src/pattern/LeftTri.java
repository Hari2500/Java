package pattern;

public class LeftTri {
	
	static void rightT() {
		int n = 5;
		for(int i=1; i<=n; i++) {
			for(int j = i; j<=n;j++) {
				System.out.print("  ");
			}
			for(int j = 1; j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	static void rightT1() {
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rightT();
		rightT1();
	}

}
