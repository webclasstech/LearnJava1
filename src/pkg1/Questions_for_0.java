package pkg1;

// https://java-slides.netlify.app/javabeginnerclass1
// תרגילים על לולאות For
public class Questions_for_0 {

	public static void main(String[] args) {
		answer1();
		answer2();
		answer3();
		answer4();
		answer5();

	}

	static void answer1() {
		System.out.println("---------- answer1 ----------");
		for( int i = 1; i<=5 ; i++ ) {
			System.out.println(i);
		}
	}
	static void answer2() {
		System.out.println("---------- answer2----------");
		for(int i = 2; i<= 20; i +=2) {
			if(i >2) {
				System.out.print(", ");
			}
			System.out.print(i);
			
		}
		System.out.println("");
	}
	static void answer3() {
		System.out.println("---------- answer3 ----------");
		for( int i = 7; i>0; i-- ) {
			for ( int j = i; j>0; j--) {
				System.out.print('*');
			}
			System.out.println("");
		}
	}
	static void answer4() {
		System.out.println("---------- answer4 ----------");
		for( int i = 1; i<=5; i++ ) {
			for ( int j = 1; j<=i; j++) {
				System.out.print(j);
			}
			System.out.println("");
		}
	}
	static void answer5() {
		System.out.println("---------- answer5 ----------");
		for( int i = 5; i>=1; i-- ) {
			for ( int j = 1; j<=i; j++) {
				System.out.print(j);
			}
			System.out.println("");
		}
	}
	
}
