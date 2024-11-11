package pkg1;
import java.util.Random;

public class Hw1 {

	public static void main(String[] args) {
		ex1();
		ex2();
		ex3();
		
	}
	
	public static void ex1() {
		System.out.println("-------------- ex1 ------------------");
		Random rand = new Random();
		int a1, a2, a3;
		a1 = rand.nextInt(10);
		a2 = rand.nextInt(10);
		a3 = rand.nextInt(10);
		int total = a1 + a2 + a3;
		System.out.println("Randomized 3 numbers are: " + a1 + " " + a2 + " " + a3);
		System.out.println("The sum of these numbers are: " + total);
		System.out.println("The average of these numbers are: " + (total/3.0));
		
	}
	
	public static void ex2() {
		System.out.println("-------------- ex2 ------------------");
		Random rand = new Random();
		int x = rand.nextInt(12);
		int y = rand.nextInt(12);
		int z = rand.nextInt(12);
		System.out.println("Randomized 3 numbers are: " + x + " " + y + " " + z);
		System.out.println("Same numbers in a reverse order: " + z + " " + y + " " + x);
	}
	
	public static void ex3() {
		System.out.println("-------------- ex3 ------------------");
		int x = 3, y = 8;
		System.out.println("x + y = " + (x+y));	
		 System.out.println(x + " + " + y + " = " + (x+y));
	}

}
