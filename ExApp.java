package Exceptionpack;

import java.util.*;

public class ExApp  {
	public static void main(String args[]) throws Exception {
		System.out.println("Enter the base and exponent ");
		Scanner sc = new Scanner(System.in);
		long s;
		int n = sc.nextInt();
		int p = sc.nextInt();
		MyCalculator obj = new MyCalculator();
		s = obj.power(n, p);
		System.out.println(n + " to the power " + p + " is " + s);
	}
}
