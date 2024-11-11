package pkg1;
import java.util.Random;
public class Questions_if {

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
	      int num3 = rand.nextInt(100);
	      System.out.println("Numbers: " + num1 + ", " + num2 + ", " + num3);
	      
	      int highest = num1;
	      if(num2 > highest) {
	    	  highest = num2;
	      }
	      if(num3 > highest) {
	    	  highest = num3;
	      }
	      
	      System.out.println("The highest num is: " + highest);   
	}
	
	private static void exr2() {
		System.out.println("-------------- exr2 ------------------");
		 Random rand = new Random();
	     int num1 = rand.nextInt(100) + 1;
	     int num2 = rand.nextInt(100) + 1;
	     System.out.println("The two numbers are: "+ num1 + " " + num2);
	     if(num1% num2 == 0 || num2% num1 == 0 ) {
	    	 System.out.println("Are dividable: yes" ); 
	     } else {
	    	 System.out.println("Are dividable: No" );
	     }
	}
	
	private static void exr3() {
		System.out.println("-------------- exr3 ------------------");
		Random rand = new Random();
	    int num1 = rand.nextInt(20) + 1;
	    System.out.println("The number " + num1);
	    if(num1 == 1) {
	    	System.out.println("One");
	    } else if (num1 == 2 ) {
	     	System.out.println("Two");
	    }  else if (num1 == 3 ) {
	     	System.out.println("Three");
	    } else {
	    	System.out.println("Bigger then three");
	    }
	}
	
	private static void exr4() {
		System.out.println("-------------- exr4 ------------------");
		Random rand = new Random();
	    int num1 = rand.nextInt(31) + 20;
	    int num2 = rand.nextInt(101) + 100;
	    System.out.println("The two numbers are: "+ num1 + " " + num2);
	    if(num1 >=20 && num1 <=40 && num2 > 180 ) {
	    	 System.out.println("YES" );
	    } else {
	    	 System.out.println("NO" );
	    }
	    
	     
	}

}
