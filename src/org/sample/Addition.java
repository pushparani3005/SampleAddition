package org.sample;

import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		int a, b, sum;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two number");
		a = sc.nextInt();
		b = sc.nextInt();
		sum = a + b;
		System.out.println("The sum of two no's" + sum);

	}

}
