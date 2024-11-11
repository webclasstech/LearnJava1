package pkg1;

import java.util.Random;

public class Questions_if_2 {

	public static void main(String[] args) {
		exr1();
		exr2();
		exr3();
		exr4();

	}
	
	private static void exr1() {
		System.out.println("-------------- exr1 ------------------");
		Random rand = new Random();
	    int num1 = rand.nextInt(100);
	    int num2 = rand.nextInt(100);
	    int total = num1 + num2;
	    System.out.println("the numbers " + num1 + " " + num2);
	    System.out.println("the total " + total );
	    if(total > 50) {
	    	System.out.println("YES");
	    } else {
	    	System.out.println("NO");
	    }
	    
	}
	private static void exr2() {
		System.out.println("-------------- exr2 ------------------");
		System.out.println("הגרילו מספר בין 100-200, אם המספר גם גדול מ 110 וגם מתחלק ב 2 , או מתחלק ב 5: הדפיסו ״YES״.");
		Random rand = new Random();
	    int num = rand.nextInt(101) + 100;
	    System.out.println("the number " + num);
	    
	    if(num > 110 && (num%2 == 0 || num%5 == 0)) {
	    	System.out.println("YES");
	    } else {
	    	System.out.println("NO");
	    }
	}
	private static void exr3() {
		System.out.println("-------------- exr3 ------------------");
		System.out.println("הגרילו מספר בין 150-170, אם ספרת האחדות גדולה מ3 הדפיסו ״more than 3״.");
		Random rand = new Random();
	    int num = rand.nextInt(21) + 150;
	    System.out.println("the number " + num);
	    if(num%10 > 3) {
	    	System.out.println("more then 3" );
	    }
	}
	private static void exr4() {
		System.out.println("-------------- exr4 ------------------");
		System.out.println("הגרילו מספר בין 1-10, ומספר בין 10 ל 20 אם ספרת האחדות זהה בשניהם: הדפיסו ״Same״.");
		Random rand = new Random();
	    int num1 = rand.nextInt(10)+1;
	    int num2 = rand.nextInt(11)+10;
	    
	    System.out.println("the numbers " + num1 + " " + num2);
	    if((num1%10) == (num2%10)) {
	    	System.out.println("Same" );
	    }
	}
}
