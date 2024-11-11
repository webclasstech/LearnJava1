package pkg1;
import java.util.Random;
// תרגיל בית 2

public class Questions_for_1 {

	public static void main(String[] args) {
		exercise1();
		exercise2();
		exercise3();
		exercise4();
		exercise5();
		exercise6();
		exercise7();
	}
	
	static void exercise1()
	{
		System.out.println("-------------- exercise1 ------------------");
		Random rand = new Random();
	    for (int myNumber = 2 ; ((myNumber%3) != 0) ; )
	    { 
	        myNumber = rand.nextInt(100);
	        System.out.println(myNumber);
	    }
	}
	
	static void exercise2()
	{
		System.out.println("-------------- exercise2 ------------------");
		Random rand = new Random();
	    for (int i = 0, myNumber =1, howManyEvenSoFar = 0 ; i < 10 ; i++)
	    {
	        myNumber = rand.nextInt(100);
	        if ((myNumber%2) == 0)
	        {
	            howManyEvenSoFar++;
	        } 
	        System.out.println(myNumber + " " + howManyEvenSoFar); 
	    }
	}
	
	static void exercise3()
	{
		System.out.println("-------------- exercise3 ------------------");
	    for (int a = 11, b = 0 ; b <= 10 ; b++, a--)
	    {
	        if (a > b)
	        {
	            System.out.println(b);
	        } 
	    }
	}
	static void exercise4() {
		System.out.println("-------------- exercise4 ------------------");
		Random rand = new Random();
		for(int i = 0; i< 5; i++) {
			int myNumber = rand.nextInt(100);
			System.out.println(myNumber);
		}
	}
	static void exercise5() {
		System.out.println("-------------- exercise5 ------------------");
		Random rand = new Random();
		int number1, number2, sumDividedByTwo ;
		
		do {
			number1 = rand.nextInt(100);
			number2 = rand.nextInt(100);
			sumDividedByTwo = (number1  + number2)%2 ;
			System.out.println(number1 + " " + number2 + " => " + sumDividedByTwo);
		}
		while (sumDividedByTwo !=0);
	}
	static void exercise6a() {
		System.out.println("-------------- exercise6a ------------------");
		Random rand = new Random();
		int number1 = rand.nextInt(100);
		int number2 = rand.nextInt(100);
		int number3 = rand.nextInt(100);
		int theTest = (number1%2)  + (number2%2) + (number3%2) ;
		System.out.println(number1 + " " + number2 +  " " + number3 + " => " + theTest);
		for(int i = 0; (theTest !=3); i++) {
			number1 = rand.nextInt(100);
			number2 = rand.nextInt(100);
			number3 = rand.nextInt(100);
			theTest = (number1%2)  + (number2%2) + (number3%2);
			System.out.println(number1 + " " + number2 +  " " + number3 + " => " + theTest);
		}
	}
	
	static void exercise6( )
	{
		System.out.println("-------------- exercise6 ------------------");
	    Random rand = new Random();
	    int count = 0, myNumber;
	    while (count < 3)
	    {
	        myNumber = rand.nextInt(100) + 1;
	        if (myNumber % 2 != 0)
	        {
	            count++;
	            System.out.println(" --- " + myNumber);
	        }
	        else {
	        System.out.println(myNumber);
	        }
	    }
	}
	
	static void exercise7() {
		System.out.println("-------------- exercise7 ------------------");
		Random rand = new Random();
		int number;
		do {
			number = rand.nextInt(500);
			System.out.println(number + " " + number%7 + " " + number/7);
		} while( number<100 || ((number%7) != 0)  );
			
	}
}
