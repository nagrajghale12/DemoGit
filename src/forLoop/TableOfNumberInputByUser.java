package forLoop;

import java.util.Scanner;

public class TableOfNumberInputByUser {
	public static void main(String[] args) {
		Scanner s= new Scanner (System.in);
		System.out.println("enter a number of which you want to print the table:");
		int n=s.nextInt();
		
		System.out.println("table for "+n+ " is:");
		for (int i=1;i<=10;i++) {
			System.out.println(n*i);
		}
	}

}
