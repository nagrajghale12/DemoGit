package starPatterns;

public class DecTriangleWithNumbers {
	public static void main(String[] args) {
		int n=5;
		for (int i=1;i<=n;i++) {
			for (int j=i,p=1;j<=n;j++) {
				System.out.print(p+" ");
			}
			System.out.println();
		}
	}

}
