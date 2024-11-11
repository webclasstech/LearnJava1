package pkg1;

import java.util.Random;

public class cw1 {

	public static void main(String[] args) {
		ex1();
		ex2();
		ex3();
		ex4();
		ex5();
		ex6();

	}
	public static void ex1() {
		System.out.println("Irina");
	}
	public static void ex2() {
		System.out.println("John");
		System.out.println("Doe");
	}
	public static void ex3() {
		int x = 123;
		System.out.println(x + " " + (x/3));
	}
	public static void ex4() {
		Random rand = new Random();
		int x = rand.nextInt(100);
		System.out.println(
				x + " " +
				(x+30) + " " + 
				(x-3) + " " + 
				(x*2) + " " +
				(x/2.0) );
	}
	public static void ex5() {
		Random rand = new Random();
		int x = rand.nextInt(20);
		int y = rand.nextInt(20);
		System.out.println(x + " " + y + " " +
				(x+y) + " " + (x*y) );
	}
	public static void ex6() {
		Random rand = new Random();
		int x = rand.nextInt(20);
		int y = rand.nextInt(20);
		int z = rand.nextInt(20);
		System.out.println(x + " " + y + " " + z);
		System.out.println(z + " " + y + " " + x);
	}
}
