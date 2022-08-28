package starPatterns;

public class IncTriangleWithIncNumbers {

	public static void main(String[] args) {
		int n=5;
		int number=1;
		for(int i=1;i<=n;i++) {
			for (int j=1;j<=i;j++) {
				System.out.print(number+" ");
				number++;
			}
			System.out.println();
		}                                          
	}
}
/*1 2 3 4 5
  3 5 7 9
  8 12 16
  20 28
  48
  
*/